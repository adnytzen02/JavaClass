/*
建立一個繼承 Thread 類別的 Practice 類別，並透過執行緒的方式，
印出一個數值，再將此數值加 1 後再印出一次。
*/


public class Main {
    public static void main(String[] args) {
        // 宣告 int 型別的變數 amount 初始化為 0。
        int amount = 0;
        
        // Practice 物件 practice，並將 amount 帶入建構子中。
        Practice practice = new Practice(amount);
        
        // 呼叫 practice.start()，開始執行 Practice 物件的 run 方法。
        practice.start();
    }
}

class Practice extends Thread {
    private int amount = 0;

    public Practice(int amount) {
        this.amount = amount;
    }

    @Override
    public void run() {
        // 在 Practice 的 run 方法中，會先印出 amount 目前的值，也就是 0。
        System.out.println(amount);

        // amount++ 會將 amount 的值加 1。
        amount++;

        // 再印出 amount 的值，此時為 1。
        System.out.println(amount);
    }
}
