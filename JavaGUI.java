/*
Swing 是一個用於 Java 的 GUI ( Graphical User Interface )小部件工具包；
用於為 Java 程序提供圖形用戶介面 ( GUI ) 的 API。
*/


import javax.swing.*;

public class JavaGUI  extends JPanel {


    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Hello world", x = 10, y = 10);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new Main()); // 將paintComponent設計的項目設定在window內
        window.setVisible(true);
    }

}
