import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumber implements Runnable{
    private int max;
    public PrintNumber(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.print(i + " "); // 印出數字
        }
    }
}

class PrintChar implements Runnable {
    private int times;
    private char aChar;

    public PrintChar(char aChar,int times) {
        this.times = times;
        this.aChar = aChar;
    }
    @Override
    public void run() {
        for (int i = 0;i < times; i++) {
            System.out.print(aChar); // 印出字元
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // ExecutorService executorService = Executors.newCachedThreadPool();  // 建立無限制大小的執行緒池
        ExecutorService executorService = Executors.newFixedThreadPool(4); // 建立固定大小的執行緒池
        executorService.execute((new PrintChar('a',20))); // 執行印出字元任務
        executorService.execute((new PrintChar('b',20))); // 執行印出字元任務
        executorService.execute(new PrintNumber(20)); // 執行印出數字任務

        executorService.shutdown(); // 關閉執行緒池
    }
}