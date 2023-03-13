/*
Java 8 導入了一個新型態的語法－Lambda。

lambda 函式是一小段代碼，它接受參數並返回一個值。
Lambda 函式類似於方法，但它們不需要名稱，並且可以直接在方法主體中實現。
由於 Lambda 並不需要替函數命名，又形容為「匿名的」函式。

表達方式有限:
    必須立即返回一個值，並且不能包含變量、賦值或語句，例如ifor for。
    parameter -> expression
    (parameter1, parameter2) -> expression

    進行更複雜的操作，可以使用帶花括號的代碼塊。
    (parameter1, parameter2) -> { code block }

    如果 lambda 函式需要返回一個值，那麼 code block 應該有一個 return。
*/

import java.util.ArrayList;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.demo_1();
        practice.demo_2();
        practice.demo_3("Hello", (s) -> s + "!");
        practice.demo_3("Hello", (s) -> s + "?");
    }
}


class Practice {
    static void demo_1() {
        // 宣告 ArrayList number
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);

        numbers.forEach( (n) -> { System.out.println(n); } );
    }

    static void demo_2() {
        // 使用 Java 的Consumer接口將 lambda 表達式存儲在變量中
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(4);

        // Consumer (消費型) 通過傳入參數，然後輸出。
        // Consumer<資料型態> 函數名稱 = (變數)匿名 -> {code block} ;
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
    }

    /*
    介面 interface，具有資料成員 與 抽象函數。
    介面中的資料成員必須設定初值，沒有一般函數，只有抽象函數。

    inetface 介面名稱 {
        <final> 資料型態 名稱 = 常數;

        <public> <abstract> 傳回值資料型態 函署名稱(引數...);
    }
    抽象函數的修飾也只能使用公有 public (或不宣告)，
    使用公有，所以不能宣告 私有private或保護 protected 。
    */
    interface StringFuction {
        String run(String str);
    }

    static void demo_3(String str, StringFuction format ) {
        String result = format.run(str);
        System.out.println(result);
    }
}