import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static Account account = new Account();

    private static class Account {
        // fields
        private int balance = 0;
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition(); // 條件物件：當存款發生時通知等待的執行緒

        public int getBalance() {
            return this.balance;
        }

        public void deposit(int amount) {
            lock.lock(); // 取得鎖
            balance += amount; // 更新帳戶餘額
            System.out.println("Deposit " + amount + "\t\t\t\t\t\t" + getBalance()); // 輸出存款資訊
            newDeposit.signalAll(); // 通知等待的執行緒存款已經發生
            lock.unlock(); // 釋放鎖
        }

        public void withdraw(int amount){
            lock.lock(); // 取得鎖
            try {
                while (balance < amount) { // 如果帳戶餘額不足，就等待新的存款發生
                    System.out.println("\t\t\t\t\t\tWait for a deposit");
                    newDeposit.await(); // 等待新的存款發生，並且釋放鎖
                }
                balance -= amount; // 更新帳戶餘額
                System.out.println("\t\t\t\t\t\tWithdraw" + amount + "\t\t" + getBalance()); // 輸出提款資訊
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock(); // 釋放鎖
            }
        }
    }

    public static class DepositTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    account.deposit((int)(Math.random() * 40) +5); // 存款隨機金額
                    Thread.sleep(1000); // 暫停 1 秒
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class WithdrawTask implements Runnable {
        @Override
        public void run() {
            while (true) {
                account.withdraw((int)(Math.random() * 10) +5); // 提款隨機金額
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new DepositTask()); // 建立存款執行緒
        executorService.execute(new WithdrawTask()); // 建立提款執行緒
        executorService.shutdown(); // 關閉執行緒池
    }
}
