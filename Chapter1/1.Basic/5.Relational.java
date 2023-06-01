public class Main {
    public static void main(String[] args) {
        // 基礎認識
        System.out.println(5 == 3);
        System.out.println(8 != 2);
        System.out.println(!(3 == 3));
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println((5 > 3) && (3 < 2));

        // 原始資料的差異
        String a = new String("username");
        String b = new String("username");
        System.out.println("使用 == 進行比較: " + a == b);
        System.out.println("使用 equals 進行比較: " + a.equals(b));


        // 比對名稱
        stringEquals("username");
    }
    static void stringEquals(String var) {
        String a = new String("username");
        String b = new String(var);
        System.out.println("\n名稱比較--Method");
        System.out.println("名稱是否一樣: " + a.equals(b));
    }
}