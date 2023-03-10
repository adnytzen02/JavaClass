/*
java執行程式時，可能會出現不同的錯誤。
編碼錯誤、輸入錯誤導致的錯誤或其他不可預見的事情。
當發生錯誤時，Java 通常會停止並生成錯誤消息。
對此的技術術語是：Java will throw an exception（拋出錯誤）。
*/

// 在Java中捕捉 Exceptions，可以用 try/catch 來完成。
public class Main {
    public static void main(String[] args) {
        Type theCatch = new Type();
        theCatch.demo_1();
        theCatch.demo_2();
        theCatch.demo_3(23);
    }
}

class Type {
    static void demo_1() {
        try {
            // 監視的Code block
            int[] myNum = {4,5,6};
            System.out.println(myNum[4]);
        }
       catch (Exception e) { // Catch block
            // 出現所指定的Exception，就會執行"Catch block"的程式。
            System.out.println("demo_1 Something went wrong.");
        }
    }
    static void demo_2() {
        try {
            int[] myNum = {24,35,56};
            System.out.println(myNum[6]);
        } catch (Exception e) {
            System.out.println("demo_2 Something went wrong.");
        }   finally { // Finally段的程式碼是不管有沒有捉到Exceptions都會執行。
            System.out.println("The try catch is finished.");
        }
    }

    static void demo_3(int age) {
        if (age < 18) {
            // throw 可以允許建立自定義錯誤
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted !");
        }
    }
}