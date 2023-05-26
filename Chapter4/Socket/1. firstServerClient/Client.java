import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    // 啟動客戶端，建立與伺服器的連接並進行數據交換
    public static void startClient() {
        Socket socket = null;

        try {
            // 建立 socket 連接
            socket = new Socket("127.0.0.1",8000);

            // 從 socket 獲取輸入和輸出流
            DataInputStream fromServer = new DataInputStream(socket.getInputStream());
            DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());

            while (true) {
                // 從使用者輸入獲取半徑值
                Scanner scanner = new Scanner(System.in);
                double radius = scanner.nextDouble();

                // 將半徑值寫入到 socket
                toServer.writeDouble(radius);
                toServer.flush();

                // 從 socket 讀取計算後的周長值
                double perimeter = fromServer.readDouble();
                System.out.println("周長是 " + perimeter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 關閉 socket 連接
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        startClient();
    }
}
