import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private static JFrame window = new JFrame();

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Hello World", 250, 250); // 在視窗上繪製文字
    }

    public static void main(String[] args) {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 設定關閉視窗時的操作
        window.setSize(500, 500); // 設定視窗大小
        window.setContentPane(new Main()); // 設定視窗的內容面板為 Main 物件
        window.setVisible(true); // 顯示視窗
    }
}

