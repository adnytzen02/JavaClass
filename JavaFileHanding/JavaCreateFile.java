/*
用來創建一個新的文件。如果文件已經存在，程式將不創建文件，
而是輸出 "File already exists." 的訊息。如果在創建文件過程中出現錯誤，
程式將輸出 "An error occurred." 的訊息並打印異常信息。
*/


import java.io.File;    // Import the File class
import java.io.IOException;      // Import the IOException class

// 定義一個名為 "JavaCreateFile" 的類。
public class JavaCreteFile {
    // 定義一個名為 "main" 的方法，它是程序的起點。
    public static void main(String[] args) {
        try {
            // 定義一個名為 "myObj" 的 File 對象，它代表文件 "filename.txt"。
            File myObj = new File("filename.txt");

            // 如果文件不存在，調用 createNewFile() 方法創建文件，
            if (myObj.createNewFile()) {
                // 創建成功，輸出 "File created: " + myObj.getName()。
                System.out.println("File created: " + myObj.getName());
            
            // 如果文件已經存在，輸出 "File already exists."。
            } else {
                System.out.println("File already exists.");
            }
        
        // 如果在文件操作過程中出現異常，輸出 "An error occurred." 並打印異常信息。
        } catch (IOException e) {
            System.out.println(An error occurred.);
            e.printStackTrace();
        }
    }
}