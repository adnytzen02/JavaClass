public class JavaString {
    public static void main(String[] args) {
        String name = "Jhon";
        System.out.println("字串長度" + name.length()); // method
        System.out.println("字串轉換小寫" + name.toLowerCase());
        System.out.println("字串轉換大寫" + name.toUpperCase());
        // index rule 0, 1, 2, ..... , n -1 , where n = string.length()
        System.out.println("字串索引最後一個字" + name.charAt(name.length() - 1));
        System.out.println("字串的字出現的位置" + name.indexOf('o'));

        // String 轉換 Integer
        String age = "24";
        System.out.println(Integer.parseInt(age)); // Java built-in method
    }
}