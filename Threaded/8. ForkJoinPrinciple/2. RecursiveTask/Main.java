import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {

    // 遞迴任務的類別
    public static class RecursiveDemo extends RecursiveTask<Integer> {
        private static final int MAX = 80; // 最小區塊大小的閾值
        private int[] arr; // 整數陣列
        private int start; // 起始索引
        private int end; // 結束索引

        // 建構子，接收整數陣列、起始索引和結束索引
        public RecursiveDemo(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            int sum = 0; // 總和變數

            // 若區塊大小小於閾值，則使用線性方式計算總和
            if ((end - start) < MAX) {
                for (int i = start; i < end; i++) {
                    sum += arr[i];
                }
                return sum;
            } else {
                int middle = (start + end) / 2; // 中間索引

                // 將區塊分成兩半，分別建立新的遞迴任務
                RecursiveDemo left = new RecursiveDemo(arr, start, middle);
                RecursiveDemo right = new RecursiveDemo(arr, middle, end);

                // 執行兩個新的遞迴任務
                invokeAll(left, right);

                // 等待兩個子任務完成並獲取其結果，然後相加得到最終的總和
                return left.join() + right.join();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[20000000]; // 整數陣列
        Random random = new Random(); // 隨機數產生器

        long startTime = System.currentTimeMillis();
        int total = 0; // 總和變數

        // 使用線性方式計算總和
        for (int i = 0; i < arr.length; i++) {
            int tmp = random.nextInt();
            arr[i] = tmp;
            total += arr[i];
        }

        long endTime = System.currentTimeMillis();

        System.out.println("總計為 " + total);
        System.out.println("線性加法所花時間為 " + (endTime - startTime) + " 毫秒.");

        ForkJoinPool forkJoinPool = new ForkJoinPool(); // 建立 ForkJoinPool

        startTime = System.currentTimeMillis();
        int result = forkJoinPool.invoke(new RecursiveDemo(arr, 0, arr.length)); // 執行並行加法
        endTime = System.currentTimeMillis();

        System.out.println("總計為 " + result);
        System.out.println("並行加法所花時間為 " + (endTime - startTime) + " 毫秒.");

        forkJoinPool.shutdown(); // 關閉 ForkJoinPool
    }
}
