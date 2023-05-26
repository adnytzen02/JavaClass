import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    // 啟動伺服器，監聽並接受來自客戶端的連接請求
    public static void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket socket = serverSocket.accept();

            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

            while (true) {
                // 從客戶端讀取半徑值
                double radius = inputFromClient.readDouble();

                // 計算周長
                double perimeter = 2 * Math.PI * radius;

                // 將周長值寫入到客戶端
                outputToClient.writeDouble(perimeter);
                outputToClient.flush();
                System.out.println("Perimeter is " + perimeter + " and has already been sent to the client.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        startServer();
    }
}
