public class MyMethod {

    public void sayHello() {
        // 印出 "Hello"
        System.out.println("Hello");
    }

    public int add(int a, int b) {
        // 回傳 a + b 的結果
        return a + b;
    }

    public static void main(String[] args) {
        // 建立 Main 物件
        MyMethod m = new MyMethod();
        
        // 呼叫 sayHello 方法，印出 "Hello"
        m.sayHello();
        
        // 呼叫 add 方法，傳入參數 1 和 2，並印出結果 3
        System.out.println(m.add(1, 2));
    }
}
