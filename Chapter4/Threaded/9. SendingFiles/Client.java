import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客戶端程式，用於連接到伺服器並向伺服器傳送請求
 */
public class Client {
    /**
     * 啟動客戶端
     */
    public static void startClient() {
        Socket socket = null;
        try {
            // 連接到伺服器
            socket = new Socket("127.0.0.1", 8000);
            DataInputStream fromServer = new DataInputStream(socket.getInputStream());
            DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());

            while (true) {
                System.out.print("Enter a filename: ");
                Scanner scanner = new Scanner(System.in);
                String s = scanner.next();

                // 將檔案名稱傳送給伺服器
                toServer.writeChars(s + '\n');
                toServer.flush();

                int i = 0;
                int length = fromServer.readInt();
                // 讀取並輸出從伺服器接收到的檔案內容
                while (i < length) {
                    System.out.print((char) fromServer.readByte());
                    i++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 關閉連線
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 主程式，啟動客戶端
     * @param args 命令列參數
     */
    public static void main(String[] args) {
        startClient();
    }
}
