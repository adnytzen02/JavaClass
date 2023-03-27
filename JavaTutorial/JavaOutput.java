public class JavaOutput {
    public static void main(String[] args) {
        Output_1();
        Output_2();
    }


    public static void  Output_1() {
    // 可以根據println()需要添加任意數量的方法。
    // 注意，將為每個方法添加一個新行。
    // 使用文本時，必須將其括在雙引號內""。
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");

    // 還有一個print()方法，唯一的區別是它不會在輸出的末尾插入新行。
    System.out.print("Hello World! ");
    System.out.print("I am learning Java"); 

    }

    public static void Output_2() {
    // 使用 println() 打印數字。
    // 與文本不同，我們不會將數字放在雙引號內。
    System.out.println(8);
    System.out.println(56);

    // 可以在方法內部進行計算。
    System.out.println(8+7);
    System.out.println(8*7);
    }
}