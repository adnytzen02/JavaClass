public class Variable {
    public static void main(String[] args) {
        // 設定 variable x 資料類型為 integer
        int x = 10;
        // x = x + 1;
        x += 2;  // 語法糖
        System.out.println(x);

        constants();

    }

    static void constants() {
        // 不會改變的 Variable
        final double  PI = 3.14;
        System.out.println(PI);
    }
}