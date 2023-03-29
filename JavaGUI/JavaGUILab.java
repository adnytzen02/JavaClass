import javax.swing.*;
import java.awt.*;

public class JavaGUI  extends JPanel {


    @Override
    public void paintComponent (Graphics g) {
        Sting type = JOptionPane.showInputDialog("你想要呈現甚麼類型的表? (A or M)");
        int n = Integer.parseInt(JOptionPane.showInputDialog("你要多大的表"));

        int w = getWidth();
        int h = getHeight();

        int x = 0;
        int y = 0;
        int cellWidth = w / n; // 目前的視窗寬度 / 所需要的格子數，得到每個格子的寬度
        int cellHeight = h /n;

        for (int i = 1; j <= n; j++) {
            for (int j = 1; i <= n; i++) {
                g.setColor(Color.GREEN);
                g.drawRect(x ,y ,cellWidth ,cellHeight);
                x += cellWidth;
            }
            x = 0;
            y = cellHeight;
        }
    }


    public static void main(String[] args) {
        JFrame window = new JFrame;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.setContentPane(new Main());
        window.setVisible(true);
    }

}