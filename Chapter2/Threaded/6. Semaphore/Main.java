import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    static int[] buffer = new int[3];  // 緩衝區陣列，用於生產者和消費者之間的資料交換
    static int producerIndex = 0;  // 生產者索引
    static int consumerIndex = 0;  // 消費者索引
    static Semaphore s_lock, n_lock, e_lock;  // 三個信號量，用於控制生產者和消費者的執行順序

    private static void append(int i) {
        buffer[producerIndex] = i;
        if (producerIndex != buffer.length - 1) {
            producerIndex++;
        } else {
            producerIndex = 0;
        }
    }

    private static int take() {
        int tmp = buffer[consumerIndex];
        if (consumerIndex != buffer.length - 1) {
            consumerIndex++;
        } else {
            consumerIndex = 0;
        }
        return tmp;
    }

    private static class ProducerTask implements Runnable {
        int thread_id;

        public ProducerTask(int thread_id) {
            this.thread_id = thread_id;
            System.out.println("Producer #" + thread_id + " launched.");
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 20; i++) {
                    e_lock.acquire();  // 等待空位的許可
                    s_lock.acquire();  // 獲取緩衝區的鎖
                    int randomInt = (int) (Math.random() * 10);
                    System.out.println("Producer " + thread_id + " produced " + randomInt);
                    append(randomInt);
                    s_lock.release();  // 釋放緩衝區的鎖
                    n_lock.release();  // 釋放項目的許可
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class ConsumerTask implements Runnable {
        int thread_id;

        public ConsumerTask(int thread_id) {
            this.thread_id = thread_id;
            System.out.println("Consumer #" + thread_id + " launched.");
        }

        @Override
        public void run() {
            try {
                int value_took;
                for (int i = 0; i < 20; i++) {
                    n_lock.acquire();  // 等待項目的許可
                    s_lock.acquire();  // 獲取緩衝區的鎖
                    value_took = take();
                    System.out.println("Consumer " + thread_id + " consumed " + value_took);
                    s_lock.release();  // 釋放緩衝區的鎖
                    e_lock.release();  // 釋放空位的許可
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Using " + 4 + " threads.");

        s_lock = new Semaphore(1);  // 緩衝區鎖的初始許可數量為 1
        n_lock = new Semaphore(0);  // 項目許可的初始數量為 0
        e_lock = new Semaphore(buffer.length);  // 空位許可的初始數量為緩衝區大小

        ExecutorService executorService = Executors.newFixedThreadPool(4);  // 創建固定大小的執行緒池
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                executorService.execute(new ProducerTask(i));  // 執行生產者任務
            } else {
                executorService.execute(new ConsumerTask(i));  // 執行消費者任務
            }
        }
        executorService.shutdown();  // 關閉執行緒池
    }
}
