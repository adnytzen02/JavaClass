public class BreakContinue {
    public static void main(String[] args) {
        whileBreak();
        forContinue();
    }

    static void whileBreak() {
        int i = 0;

        while (true) { // 無限迴圈
            if (i == 5) { // 當計數器 i 等於 5 時
                break; // 跳出迴圈
            }
            System.out.println(i); // 輸出計數器 i 的值
            i++; // 將計數器 i 的值加 1
        }
    }

    static void forContinue() {
        for (int i = 0; i < 20; i++) { // 迴圈從 0 開始，每次遞增 1，迴圈條件是 i < 20
            if (i == 10) { // 當計數器 i 等於 10 時
                continue; // 跳過本次迴圈，執行下一次迴圈
            }
            System.out.print(i + " "); // 輸出計數器 i 的值，並後面加上空格
        }
    }
}
