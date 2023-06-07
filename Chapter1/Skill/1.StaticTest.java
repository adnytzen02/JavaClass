public class StaticTest {

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        StaticTest s = new StaticTest();
        
        // 使用 Main 實例 m 呼叫 sum 方法，傳入兩個整數參數，輸出兩數之和
        s.sum(25, 36);
        
        // 直接呼叫靜態方法 sayHello，輸出 "Hello"
        sayHello();
    }
}
