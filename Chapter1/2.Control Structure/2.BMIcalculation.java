import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIcalculation {

    private static final DecimalFormat DF = new DecimalFormat("0.00"); // 建立一個格式化數字的物件，用來將BMI數值格式化為兩位小數點
    private static final String exit = "exit"; // 設定一個字串常數，用來判斷使用者是否要退出程式

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 建立一個Scanner物件，用來讀取使用者的輸入
        String input = ""; // 用來儲存使用者輸入的字串

        while (!input.equals(exit)) { // 當使用者輸入的字串不是"exit"時，執行迴圈
            System.out.print("請輸入您的體重(公斤): ");
            double weight = scanner.nextDouble(); // 讀取使用者輸入的體重值

            System.out.print("請輸入您的身高(公分): ");
            double height = scanner.nextDouble() / 100; // 讀取使用者輸入的身高值並轉換為公尺

            double bmi = Double.parseDouble(DF.format(weight / (height * height))); // 計算BMI數值，並保留兩位小數
            System.out.println("您的BMI數值為: " + bmi);

            // 根據BMI數值顯示對應的體重狀態
            if (bmi < 18.5) {
                System.out.println("您屬於過輕");
            } else if (bmi < 24) {
                System.out.println("您屬於正常");
            } else if (bmi < 30) {
                System.out.println("您屬於微胖");
            } else {
                System.out.println("您屬於過重");
            }

            // 清除輸入緩衝區，以避免下一次迴圈讀取錯誤的輸入
            scanner.nextLine();

            System.out.println("輸入 'exit' 以結束程式，或按任意鍵繼續計算BMI");
            input = scanner.nextLine(); // 讀取使用者輸入的字串，以決定是否要退出程式
        }

        scanner.close(); // 關閉Scanner物件，釋放資源
    }
}
