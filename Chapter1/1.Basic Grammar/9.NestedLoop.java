public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // 外層迴圈，計數器 i 從 0 開始，每次遞增 1，迴圈條件是 i < 10
            for (int j = 3; j > 0; j--) { // 內層迴圈，計數器 j 從 3 開始，每次遞減 1，迴圈條件是 j > 0
                System.out.println(i + ", " + j); // 輸出計數器 i 和 j 的值
            }
        }
    }
}
