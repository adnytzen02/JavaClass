import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static Account account = new Account();

    // 定義一個 Account 類別，用於保存餘額和存款的操作
    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return this.balance;
        }

        // 存款操作，每次將餘額增加 1，並讓執行緒睡眠 3 毫秒，模擬一些計算運算
        public void deposit() {
            int newBalance = this.balance + 1;

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.balance = newBalance;
        }
    }

    // 定義一個 AddMoneyTask 類別，實作 Runnable 介面
    private static class AddMoneyTask implements Runnable {

        @Override
        public void run() {
            // 在該任務中調用 Account 的存款方法
            account.deposit();
        }
    }

    public static void main(String[] args) {
        // 創建一個線程池，使用 Executors 的 newCachedThreadPool 方法創建一個緩存線程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 創建 5000 個 AddMoneyTask 任務，提交給線程池執行
        for (int i = 0; i < 2000; i++) {
            executorService.execute(new AddMoneyTask());
        }

        // 停止接收新的任務，等待線程池中的所有任務完成
        executorService.shutdown();

        // 等待線程池中的所有任務完成後再繼續執行，避免在沒有完成的情況下就去取得餘額
        while (!executorService.isTerminated()) {
        }

        // 最後取得餘額並輸出
        System.out.println("The balance is " + account.getBalance());
    }

}