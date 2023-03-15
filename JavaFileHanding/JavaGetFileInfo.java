import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (mtObj.exists()) {
            System.out.println("檔案名稱: " + myObj.getName());
            System.out.println("絕對路徑: " + myObj.getAbsolutePath());
            System.out.println("檔案能否寫" + myObj.canWrite());
            System.out.println("檔案能否讀" + myObj.canRead());
            System.out.println("檔案大小" + myObj.length());
        } else {
            System.out.println("找到檔案不存在");
        }
    }
}