import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    private ConcurrentLinkedQueue<Integer> queue;
    private Random rand = new Random();

    public Producer(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            int num = rand.nextInt(100);
            queue.offer(num);
            System.out.println("Producer produced: " + num);
            try {
                sleep(rand.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private ConcurrentLinkedQueue<Integer> queue;
    private Random rand = new Random();

    public Consumer(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            if (!queue.isEmpty()) {
                int num = queue.poll();
                System.out.println("Consumer consumed: " + num);
                try {
                    sleep(rand.nextInt(500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
