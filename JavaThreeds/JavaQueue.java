import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JavaQueue<Integer> queue = new JavaQueue<>();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    private JavaQueue<Integer> queue;
    private Random rand = new Random();

    public Producer(JAvaQueue<Integer> queue) {
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
    private JavaQueue<Integer> queue;
    private Random rand = new Random();

    public Consumer(JavaQueue<Integer> queue) {
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
