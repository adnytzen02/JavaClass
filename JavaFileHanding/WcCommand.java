import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WcCommand {
    public static void main(String[] args) {
        // 要求使用者輸入檔案名稱
        String filename = JOptionPane.showInputDialog("Filename");
        // 建立檔案物件
        File f = new File(filename) ;
        // 初始化統計數值
        int line_count = 0;
        int word_count = 0;
        int char_count = 0;

        try {
            // 建立檔案讀取器
            Scanner scanner = new Scanner(f);
            // 開始讀取檔案
            while (scanner.hasNextLine()) {
                // 紀錄行數
                line_count++;
                // 讀取一行文字
                String line = scanner.nextLine();
                // 將文字依照空格拆成單字陣列
                String[] line_arr = line.split(" ");
                // 累加單字數
                for (String word : line_arr) {
                    word_count++;
                }
                // 累加字元數
                char_count += line.length();
            }
            scanner.close();

            // 印出統計結果
            System.out.println("Line count is " + line_count);
            System.out.println("Word count is " + word_count);
            System.out.println("Character count is " + char_count);


        } catch (FileNotFoundException e) {
            // 如果找不到檔案，則印出錯誤訊息
            System.out.println(f + " not found.");
        }

    }

}
