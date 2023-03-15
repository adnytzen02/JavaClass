/*
讀取名為"filename.txt"的檔案並將其輸出到控制台。
*/


// 導入java.io.File和java.util.Scanner類別，因為它們將用於讀取檔案。
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaReadFile {
    public static void main(String[] args) {
        // 使用try-catch語句來處理FileNotFoundException異常，以防止檔案不存在或無法讀取。
        try {
            // 用File類別創建一個新的myObj物件，該物件代表名為"filename.txt"的檔案。
            File myObj = new File("filename.txt");
            // 創建一個新的myReader物件，該物件將用於讀取myObj物件中的數據。
            Scanner myReader = new Scanner(myObj);

            // 使用while迴圈，不斷讀取myReader物件中的每一行，直到讀到檔案末尾。
            while (myReader.hasNextLine()) {
                // 將每一行的數據存儲在data變數中並打印出來。
                String data = myReader.nextLine();
                System.out.println(data);
            }
            // 關閉myReader物件，以釋放資源並避免資源洩漏。
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}