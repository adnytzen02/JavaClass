/*
java執行程式時，可能會出現不同的錯誤。
編碼錯誤、輸入錯誤導致的錯誤或其他不可預見的事情。
當發生錯誤時，Java 通常會停止並生成錯誤消息。
對此的技術術語是：Java will throw an exception（拋出錯誤）。
*/

// 在Java中捕捉 Exceptions，可以用 try/catch 來完成。
public class Main {
    public static void main(String[] args) {

    }
}

class Type {
    static void demo_1() {
        try {

        }
    } catch (Exception e) {
        System.out.println("Something went wrong.");
    }
}