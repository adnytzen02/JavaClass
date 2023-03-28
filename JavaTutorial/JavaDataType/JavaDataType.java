public class JavaDataType {
    public static void main(String[] args) {
        integer();
        floating();
        str();
    }

    public static void integer() {
        int num_1 = 2147483647;
        long num_2 = 15000000000L;

        // 通常是首選數據類型 int 
        System.out.println(num_1);
        // 當int不夠存儲時使用 long，要以 L 結尾 
        System.out.println(num_2);
    }

    public static void floating() {
        float num_1 = 5.87f;
        double num_2 = 19.88d;

        // 數據float類型double可以存儲小數。
        // 浮點數應以 f 結尾，雙精度數應以 d 結尾。
        System.out.println(num_1);
        System.out.println(num_2);
    }

    public static void str() {
        // char數據類型用於存儲 單個字符。必須用單引號括起來。
        char myChar = 'A';
        System.out.println(myChar);

        // 可以使用 ASCII 值來顯示某些字符。
        cahr myVar1 = 65,myVar2 = 66;
        System.out.println(myVar1);
        System.out.println(myVar2);

        // cahr 跟 String 資料類型不一樣
        char myVar3 = 'R';
        String myVar4 = "R";
        
        // boolean ，只能取值 true or false。
        boolean myBoolean = true;
        System.out.println(myBoolean);
    }
}