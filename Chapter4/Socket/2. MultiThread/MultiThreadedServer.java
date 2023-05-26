import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 處理客戶端請求的執行緒
class HandleClient implements Runnable {

    private Socket socket;

    // 建構函式，初始化執行緒的 socket
    public HandleClient(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 創建用於讀取客戶端數據的 DataInputStream
            DataInputStream inputFromClient = new DataInputStream(this.socket.getInputStream());
            // 創建用於向客戶端寫入數據的 DataOutputStream
            DataOutputStream outputToClient = new DataOutputStream(this.socket.getOutputStream());

            while (true) {
                // 從客戶端讀取半徑值
                double radius = inputFromClient.readDouble();
                // 根據半徑計算周長
                double perimeter = 2 * Math.PI * radius;

                // 將周長寫入到客戶端
                outputToClient.writeDouble(perimeter);
                outputToClient.flush();
                System.out.println("周長為 " + perimeter + "，已發送給客戶端。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadedServer {
    // 紀錄連接的客戶端數量
    private int clientNumber = 0;

    public void start(){
        try {
            // 創建伺服器套接字，監聽指定端口上的連接請求
            ServerSocket serverSocket = new ServerSocket(8000);

            while (true) {
                // 監聽新的連接
                Socket socket = serverSocket.accept();

                // 更新客戶端數量
                clientNumber++;
                System.out.println("第 " + clientNumber + " 個客戶端連接中...");
                InetAddress inetAddress = socket.getInetAddress();
                System.out.println("客戶端 IP 地址：" + inetAddress.getHostAddress());
                System.out.println("客戶端主機名：" + inetAddress.getHostName());

                // 創建並啟動新的執行緒來處理客戶端請求
                new Thread(new HandleClient(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 啟動多線程伺服器
        new MultiThreadedServer().start();
    }
}
