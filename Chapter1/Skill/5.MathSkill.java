public class MathSkill {
    public static void main(String[] args) {
        double PI = Math.PI;  // 宣告一個常數 PI，值為圓周率

        int x = 10;
        int y = 36;

        System.out.println(Math.max(x, y));  // 輸出 x 和 y 中的最大值
        System.out.println(Math.min(x, y));  // 輸出 x 和 y 中的最小值

        System.out.println(Math.floor(PI));  // 取 PI 的下限值（小於或等於 PI 的最大整數）

        System.out.println(Math.ceil(PI));  // 取 PI 的上限值（大於或等於 PI 的最小整數）

        System.out.println(Math.sqrt(y));  // 輸出 y 的平方根

        System.out.println(Math.pow(y, x));  // 計算 y 的 x 次方

        System.out.println(Math.log(x));  // 計算 x 的自然對數
    }
}
