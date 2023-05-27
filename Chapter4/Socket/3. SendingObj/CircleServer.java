import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CircleServer {
    ObjectInputStream fromClient;
    DataOutputStream toClient;

    public CircleServer() {
        try {
            // 建立伺服器套接字，並監聽指定的端口號
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("伺服器已啟動！");

            while (true) {
                // 接受客戶端的連接請求，並建立與客戶端的套接字連接
                Socket socket = serverSocket.accept();
                // 建立物件輸入流，用於從客戶端的輸入流讀取物件
                fromClient = new ObjectInputStream(socket.getInputStream());
                // 建立資料輸出流，用於向客戶端的輸出流寫入資料
                toClient = new DataOutputStream(socket.getOutputStream());
                // 從客戶端的物件輸入流讀取一個 Circle 物件
                Circle object = (Circle) fromClient.readObject();
                Double radius = object.getRadius();
                // 將計算結果寫入到資料輸出流，傳送給客戶端
                toClient.writeDouble(Math.PI * radius * radius);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fromClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new CircleServer();
    }
}
