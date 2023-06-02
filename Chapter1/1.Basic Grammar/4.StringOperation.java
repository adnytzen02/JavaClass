public class StringOperation {
    public static void main(String[] args) {
        String name = "username";
        String age = "27";

        // String 的長度
        System.out.println(name.length());

        // String 轉換大寫
        System.out.println(name.toUpperCase());
        // String 轉換小寫
        System.out.println(name.toLowerCase());

        stringIndex(name);
        stringParseInt(age);
    }
    static void stringIndex(String name) {
        // index 索引  --- 從 0 開始數，n - 1 是最後一個數

        // 第一個數
        System.out.println(name.charAt(0));

        // 第二個數
        System.out.println(name.charAt(name.length() - 1));

        // 找尋特定的字
        System.out.println(name.indexOf('s'));

    }

    static void stringParseInt(String age) {
        // 將 String 轉換為 Int
        System.out.println(Integer.parseInt(age));
    }
}
