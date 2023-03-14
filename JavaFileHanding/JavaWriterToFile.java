/*
程式會在檔案"filename.txt"中寫入一行文字，
並顯示"Successfully wrote to the file."的訊息，表示寫入成功。
如果發生任何IO例外，程式會顯示"An error occurred."的訊息，並列印出詳細的錯誤堆疊。
*/

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
        // 建立FileWriter物件，並指定檔案名稱。
        FileWriter myWriter = new FileWriter("filename.txt");

        // 使用FileWriter物件的write()方法寫入資料到檔案。
        myWriter.write("Files in Java might be tricky, but it is fun enough!");

        // 使用FileWriter物件的close()方法關閉檔案。
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
}