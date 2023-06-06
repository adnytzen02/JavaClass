import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class MergeSort {

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // 對前半部分進行合併排序
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // 對後半部分進行合併排序
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // 合併兩個已排序的子陣列
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] tmp) {
        int i = 0;
        int j = 0;
        int k = 0;

        // 將兩個子陣列按照順序合併到一個暫存陣列中
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                tmp[k] = list1[i];
                i++;
            } else {
                tmp[k] = list2[j];
                j++;
            }
            k++;
        }

        // 將第一個子陣列中剩餘的元素放入暫存陣列
        while (i < list1.length) {
            tmp[k] = list1[i];
            k++;
            i++;
        }
        // 將第二個子陣列中剩餘的元素放入暫存陣列
        while (j < list2.length) {
            tmp[k] = list2[j];
            k++;
            j++;
        }
    }
}

public class Main {
    private static class SortTask extends RecursiveAction {

        private final int THRESHOLD = 500;
        private int[] list;

        public SortTask(int[] list) {
            this.list = list;
        }

        @Override
        protected void compute() {
            if (list.length < THRESHOLD) {
                Arrays.sort(list); // 對小於閾值的子陣列進行排序
            } else {
                // 獲取第一個子陣列
                int[] firstHalf = new int[list.length / 2];
                System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

                // 獲取第二個子陣列
                int secondHalfLength = list.length - list.length / 2;
                int[] secondHalf = new int[secondHalfLength];
                System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

                // 建立並執行兩個子任務
                invokeAll(new SortTask(firstHalf), new SortTask(secondHalf));

                // 合併兩個已排序的子陣列
                MergeSort.merge(firstHalf, secondHalf, list);
            }
        }
    }

    public static void paralleMergeSort(int[] list) {
        RecursiveAction recursiveAction = new SortTask(list);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(recursiveAction);
    }

    public static void main(String[] args) {
        final int SIZE = 500000;
        int[] list1 = new int[SIZE];
        int[] list2 = new int[SIZE];

        // 隨機生成兩個陣列
        for (int i = 0; i < list1.length; i++) {
            list1[i] = (int) (Math.random() * 100000);
            list2[i] = (int) (Math.random() * 100000);
        }

        // 使用並行合併排序測量時間
        long startTime = System.currentTimeMillis();
        paralleMergeSort(list1);
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel time with " + Runtime.getRuntime().availableProcessors() + " processors is " + (endTime - startTime) + " milliseconds");

        // 使用順序合併排序測量時間
        startTime = System.currentTimeMillis();
        MergeSort.mergeSort(list2);
        endTime = System.currentTimeMillis();
        System.out.println("Sequential time is " + (endTime - startTime) + " milliseconds.");
    }
}
