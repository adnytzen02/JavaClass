class PrintNumber implements Runnable{
    private int max;
    public PrintNumber(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.print(i + " ");
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
            System.out.print(aChar);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 建立線程，參數為印出最大數字
        Thread thread1 = new Thread(new PrintNumber(50));
        // 建立線程，參數為印出字元及次數
        Thread thread2 = new Thread(new PrintChar('a',50));

        // 開始執行線程
        thread1.start();
        thread2.start();
    }
}
