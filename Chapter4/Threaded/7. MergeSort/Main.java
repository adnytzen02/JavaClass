class MergeSort {

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // 如果陣列長度大於1，執行合併排序

            // 將陣列分成兩半
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf); // 遞迴排序前半部分

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf); // 遞迴排序後半部分

            // 合併兩個已排序的子陣列
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] tmp) {
        int i = 0; // 指向list1的指標
        int j = 0; // 指向list2的指標
        int k = 0; // 指向tmp的指標

        // 比較list1和list2中的元素，將較小的值存入tmp中
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

        // 將list1中剩餘的元素放入tmp
        while (i < list1.length) {
            tmp[k] = list1[i];
            k++;
            i++;
        }
        // 將list2中剩餘的元素放入tmp
        while (j < list2.length) {
            tmp[k] = list2[j];
            k++;
            j++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] list = {4, 36, 20, 46, 8, 7, 444, 93, 342, 783, 48};
        MergeSort.mergeSort(list); // 呼叫MergeSort類別中的mergeSort方法對list進行排序
        for (int n : list) {
            System.out.print(n + " "); // 輸出排序後的結果
        }
    }
}