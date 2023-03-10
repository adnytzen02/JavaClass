/*
Wrapper class 內的物件(object)包含基本資料型類別(primitive data types)。
Wrapper class創建一個物件時，它會包括一個變數而這個變數會包含一個資料型類別。

作用:
    透過將基本資料型類別轉做物件，可以將基本資料型類別(primitive data types)轉換成其他基本資料型類別。
    將基本資料型類別轉做物件(Objects)，再應用到Collection framework (例如 ArrayList and Vector)。
    在java.util package內，只可以處理(Objects) 。
    可以在多執行緒的情況下支持同步。

在Java中:
    基本資料型類別(primitive data types)。
    它們有各自對應的Wrapper Class。
Primitive Data Type    <===>   Wrapper Class
    byte    <===>   Byte
    short   <===>   Short
    int     <===>   Integer
    long    <===>   Long
    float   <===>   Float
    double  <===>   Double
    boolean <===>   Boolean
    char    <===>   Character
*/


public class javaWrapper {
    public static void main(String[] args) {
        Type wrapper = new Type();
        wrapper.demo_1();
        wrapper.demo_2();
        wrapper.demo_3();
    }
}


class Type {
    static void demo_1() {
        Integer myInt = 35;
        Double myDouble = 19.99;
        Character myChar = 'Z';
        System.out.println("直接打印結果:");
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }

    static void demo_2() {
        Integer myInt = 35;
        Double myDouble = 19.99;
        Character myChar = 'Z';
        System.out.println("\n獲取與相應包裝對象關聯的值:");
        System.out.println("intValue(): " + myInt.intValue());
        System.out.println("doubleValue(): " + myDouble.doubleValue());
        System.out.println("charValue() " + myChar.charValue());   
    }

    static void demo_3() {
        // 是toString()方法，它用於將包裝器對象轉換為字符串。
        // 轉換 Integer 為 String，用length()方法將String輸出"string"的長度。
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println("\n轉換 Integer 為 String，得到轉換後的長度:");
        System.out.println("String.length(): " + myString.length());
    }
}