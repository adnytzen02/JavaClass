public class Reference {

    /**
     * 改變整數值的方法
     * @param x 整數參數
     */
    public static void changeA(int x) {
        x = 20;  // 改變參數的值
    }

    /**
     * 測試 changeA 方法
     */
    public static void testA() {
        int a = 10;  // 創建一個整數變數 a，並賦值為 10
        changeA(a);  // 呼叫 changeA 方法，傳入 a 的值作為參數
        System.out.println(a);  // 輸出 a 的值
    }

    /**
     * 複製陣列的方法
     */
    public static void copyList() {
        int[] myArray1 = {10, 20, 30};  // 創建一個整數陣列 myArray1，並賦值
        int[] myArray2 = myArray1;  // 將 myArray1 複製到 myArray2

        myArray1[0] = 40;  // 改變 myArray1 的第一個元素的值

        for (int i : myArray1) {
            System.out.println(i + " ");  // 輸出 myArray1 的元素值
        }

        for (int i : myArray2) {
            System.out.println(i + " ");  // 輸出 myArray2 的元素值
        }
    }

    /**
     * 改變陣列元素的方法
     * @param arr 整數陣列
     */
    public static void changeElement(int[] arr) {
        arr[0] = 1000;  // 改變陣列的第一個元素的值
    }

    public static void main(String[] args) {
        testA();  // 呼叫 testA 方法
        copyList();  // 呼叫 copyList 方法

        int[] myArr1 = {10, 20, 30};  // 創建一個整數陣列 myArr1，並賦值
        changeElement(myArr1);  // 呼叫 changeElement 方法，傳入 myArr1 作為參數

        for (int i : myArr1) {
            System.out.println(i);  // 輸出 myArr1 的元素值
        }
    }
}
