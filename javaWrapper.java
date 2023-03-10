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


public class Main {
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
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }

    static void demo_2() {
        Integer myInt = 35;
        Double myDouble = 19.99;
        Character myChar = 'Z';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());   
    }

    static void demo_3() {
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}