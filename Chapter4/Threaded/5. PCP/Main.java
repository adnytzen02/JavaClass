import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Main {

    private static Buffer buffer = new Buffer();

    private static class Buffer {
        private static final int CAPACITY = 1;
        private LinkedList<Integer> queue = new LinkedList<>();
        private static Lock lock = new ReentrantLock();
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        public void input(int value) {
            lock.lock(); // 取得鎖
            try {
                while (queue.size() == CAPACITY) {
                    notFull.await(); // 如果緩衝區已滿，進入等待狀態，直到有空間可用
                }
                queue.offer(value); // 將產品放入緩衝區
                notEmpty.signalAll(); // 通知消費者可以取用產品
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // 釋放鎖
            }
        }

        public int output() {
            int value = 0;
            lock.lock(); // 取得鎖
            try {
                while (queue.isEmpty()) {
                    notEmpty.await(); // 如果緩衝區為空，進入等待狀態，直到有產品可用
                }
                value = queue.remove(); // 從緩衝區中取出產品
                notFull.signalAll(); // 通知生產者可以放入產品
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // 釋放鎖
                return value;
            }
        }
    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Consumer reads " + buffer.output()); // 消費者從緩衝區中取出產品
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Producer implements Runnable {

        @Override
        public void run() {
            try {
                int i = 0;
                while (true) {
                    System.out.println("Producer writes " + i); // 生產者放入產品到緩衝區
                    buffer.input(i++);
                    Thread.sleep((int) (Math.random() * 1000));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Producer());
        executorService.execute(new Consumer());
        executorService.shutdown();
    }
}
