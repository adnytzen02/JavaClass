package vister;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

/**
 * 多線程伺服器程式，用於處理客戶端的請求
 */
class HandleClient implements Runnable {
    private Socket socket;

    /**
     * 建構函式，初始化處理客戶端的 Socket
     * @param socket 客戶端的 Socket
     */
    public HandleClient(Socket socket) {
        this.socket = socket;
    }

    /**
     * 執行緒的執行方法
     */
    @Override
    public void run() {
        try {
            DataInputStream inputFromClient = new DataInputStream(this.socket.getInputStream());
            DataOutputStream outputToClient = new DataOutputStream(this.socket.getOutputStream());

            while (true) {
                String filename = "";
                char i = ' ';
                while ((int) i != 10){
                    i = inputFromClient.readChar();
                    if ((int) i != 10) {
                        filename += i;
                    }
                }

                File f = new File(filename);
                try {
                    byte[] fileContent = Files.readAllBytes(f.toPath());
                    outputToClient.writeInt(fileContent.length);
                    for (int j = 0; j < fileContent.length; j++) {
                        outputToClient.writeByte(fileContent[j]);
                    }
                } catch (NoSuchFileException e) {
                    String message = "File not Found. Please try AGAIN\n";
                    outputToClient.writeInt(message.length());
                    outputToClient.writeBytes(message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 多線程伺服器程式，接受並處理客戶端的連線請求
 */
public class MultithreadedServer {
    private int client_number = 0;

    /**
     * 啟動伺服器，監聽客戶端的連線請求
     */
    public void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            while (true) {
                Socket socket = serverSocket.accept();
                client_number++;
                System.out.println("Client #" + client_number + " connecting....");
                new Thread(new HandleClient(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 主程式，啟動多線程伺服器
     * @param args 命令列參數
     */
    public static void main(String[] args) {
        new MultiThreadedServer().start();
    }
}
