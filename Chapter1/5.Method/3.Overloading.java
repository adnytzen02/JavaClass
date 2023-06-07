public class Overloading {

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        
        // 呼叫 sum 方法，傳入兩個整數參數，輸出兩數之和
        sum(12, 56);
        
        // 呼叫 sum 方法，傳入兩個浮點數參數，輸出兩數之和
        sum(11.2, 55.3);
    }
}
