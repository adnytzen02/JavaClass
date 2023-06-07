public class Exchange {

    /**
     * 交換兩個整數的值
     * @param a 第一個整數
     * @param b 第二個整數
     */
    public static void exchange(int a, int b) {
        int temp = a;  // 將 a 的值存儲在暫存變量 temp 中
        a = b;        // 將 b 的值賦給 a
        b = temp;     // 將 temp 的值賦給 b
        System.out.println(a + " " + b);  // 輸出交換後的兩個整數值
    }

    /**
     * 交換兩個浮點數的值
     * @param a 第一個浮點數
     * @param b 第二個浮點數
     */
    public static void exchange(double a, double b) {
        double temp = a;  // 將 a 的值存儲在暫存變量 temp 中
        a = b;            // 將 b 的值賦給 a
        b = temp;         // 將 temp 的值賦給 b
        System.out.println(a + " " + b);  // 輸出交換後的兩個浮點數值
    }

    public static void main(String[] args) {
        exchange(10, 25);  // 呼叫 exchange 方法，傳入兩個整數參數
    }
}
