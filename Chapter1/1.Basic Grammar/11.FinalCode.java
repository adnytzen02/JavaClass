import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 0; // 最小數字
        int max = 100; // 最大數字
        Random r = new Random();

        int secret = r.nextInt(max - min) + min; // 生成秘密數字
        System.out.println("Final Code is : " + secret); // 輸出秘密數字（僅供測試用）

        while (true) {
            System.out.print("Guess (between " + min + " and " + max + ") :");
            int guess = s.nextInt(); // 讀取玩家的猜測數字

            if (guess > max || guess < min) { // 判斷猜測數字是否在有效範圍內
                System.out.println("Please input valid guess.");
                continue; // 無效猜測，繼續下一輪迴圈
            }

            if (guess == secret) { // 猜中了秘密數字
                System.out.println("Congratulations! " + secret + " is the Final Code.");
                break; // 結束遊戲
            }

            if (guess < secret) { // 猜測數字比秘密數字小
                min = guess; // 更新最小數字範圍
            } else { // 猜測數字比秘密數字大
                max = guess; // 更新最大數字範圍
            }
        }
    }
}
