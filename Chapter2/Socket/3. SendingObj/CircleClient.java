import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CircleClient {
    public static void main(String[] args) {
        try {
            // 建立與伺服器的連接
            Socket socket = new Socket("localhost", 8000);
            // 建立物件輸出流，用於將物件寫入伺服器的輸出流
            ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
            // 建立資料輸入流，用於從伺服器的輸入流讀取資料
            DataInputStream fromServer = new DataInputStream(socket.getInputStream());
            
            // 創建一個 Circle 物件
            Circle c = new Circle(10);
            // 將 Circle 物件寫入物件輸出流，以傳送到伺服器
            toServer.writeObject(c);

            // 從伺服器的資料輸入流讀取一個 double 值
            System.out.println(fromServer.readDouble());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
