import javax.swing.*;
import java.awt.*;

public class JavaGUI  extends JPanel {
    String type;
    int n;

    public Main() {
        type = JOptionPane.showInputDialog("你想要呈現甚麼類型的表? (A or M)");
        n = Integer.parseInt(JOptionPane.showInputDialog("你要多大的表"));
    }


    @Override
    public void paintComponent (Graphics g) {
        int w = getWidth();
        int h = getHeight();

        int x = 0;
        int y = 0;
        int cellWidth = w / n; // 目前的視窗寬度 / 所需要的格子數，得到每個格子的寬度
        int cellHeight = h /n;

        // 第一排的外框
        for (int i = 1; j <= n; j++) {
            for (int j = 1; i <= n; i++) {

                if (i == 1 || j == 1) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(x, y,cellWidth,cellHeight);
                }

                // 格子外框
                g.setColor(Color.BLACK);
                g.drawRect(x ,y ,cellWidth, cellHeight);

                // 第一排的數字
                if (i == 1) {
                    g.drawString(""+ j , x + 5, y + 15);
                } else if (j == 1) {
                    g.drawString(""+ i, x + 5, y + 15);
                } else {
                    int value;
                    if (type.toLowerCase.equals("A")) {
                        value = i + j;
                    } else {
                        value = i * j;
                    }
                    g.drawString(""+ value, x + 5, y + 15); 
                }

                g.drawString(""+ i + ", " + j, x + 5, y + 15); // String後面加上數字就會轉換成String
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
