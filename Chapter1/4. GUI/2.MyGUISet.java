import javax.swing.*;
import java.awt.*;

public class MyJavaSet extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        // 獲取當前視窗大小
        int width = getWidth();
        int height = getHeight();

        // 設定背景顏色
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, width, height);

        // 設定圖片
        ImageIcon img = new ImageIcon(filename);

        // 繪製圖形
        g.setColor(Color.BLACK); // 長方形的顏色
        g.fillRect(100,100,width,height); // 畫長方形(X座標,y座標,寬度,長度)、(drawRect 空心)

        g.setColor(Color.RED); // 線的顏色
        g.drawLine(10, 10, 50, 50);  // 劃一條線

        g.setColor(Color.BLUE); 
        g.fillOval(0, 0, 100, 100); // 劃一個半徑為10的正圓，darwOval是空心的圓

        // 顯示圖片
        img.paintIcon(null, g, 50, 50);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setContentPane(new JavaGUI()); // 將 JavaGUI 物件設定為視窗的內容面板
        window.setVisible(true);
    }

}
