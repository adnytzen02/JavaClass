import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    String type;
    int n;

    public Main() {
        // 詢問使用者選擇要顯示的表格類型和大小
        this.type = JOptionPane.showInputDialog("Please select table (addition table or multiplication) A / M");
        this.n = Integer.parseInt(JOptionPane.showInputDialog("How big do you want to be?"));
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        int x = 0;
        int y = 0;
        int cellWidth = width / n;
        int cellHeight = height / n;

        // 迴圈繪製表格內容
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                g.setColor(Color.GRAY);
                g.fillRect(x, y, width, height);

                // 標示表格邊緣
                if (i == 1 || j == 1) {
                    g.setColor(Color.DARK_GRAY);
                    g.fillRect(x, y, cellWidth, cellHeight);
                }

                // 繪製格子邊框
                g.setColor(Color.ORANGE);
                g.drawRect(x, y, cellWidth, cellHeight);

                // 標示數字或運算式
                if (i == 1) {
                    g.setColor(Color.CYAN);
                    g.drawString("" + j, x + 5, y + 15);
                } else if (j == 1) {
                    g.setColor(Color.CYAN);
                    g.drawString("" + i, x + 5, y + 15);
                } else {
                    int value;
                    if (type.toLowerCase().equals("a")) {
                        value = i + j;
                    } else {
                        value = i * j;
                    }

                    g.setColor(Color.CYAN);
                    g.drawString("" + value, x + 5, y + 15);
                }

                x += cellWidth;
            }
            x = 0;
            y += cellHeight;
        }
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setContentPane(new Main());
        window.setVisible(true);
    }

}
