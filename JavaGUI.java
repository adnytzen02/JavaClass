/*
Swing 是一個用於 Java 的 GUI ( Graphical User Interface )小部件工具包；
用於為 Java 程序提供圖形用戶介面 ( GUI ) 的 API。
*/


import javax.swing.*;

public class JavaGUI  extends JPanel {


    @Override
    // Java calls the paintComponent method when it needs to.
    public void paintComponent(Graphics g) {
        // 有先後順序
        // g.drawString("Hello world", x = 10, y = 10); //顯示字串

        // 獲取當前視窗大小
        int width = getWidth();
        int height = getHeight();

        // 設定圖片
        ImageIcon img = new ImageIcon(filename);

        g.setColor(Color.BLACK); // 長方形的顏色
        g.fillRect(100,100,width,height); // 畫長方形(X座標,y座標,寬度,長度)、(drawRect 空心)

        g.setColor(Color.RED); // 線的顏色
        g.drawLine(10,10,50,50); // 劃一條線

        g.setColor(Color.BLUE);
        g.fillOval(0, 0, 100, 100); // 劃一個半徑為10的正圓，darwOval是空心的圓

        // 顯示圖片
        img.paintIcon(null, g, 50, 50);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new Main()); // 將paintComponent設計的項目設定在window內
        window.setVisible(true);
    }

}
