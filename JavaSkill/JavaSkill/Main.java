import javax.swing.;
import java.awt.;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener {
    Sheep s; // 宣告一個 Sheep 物件 s

public Main() {
    s = new Sheep(40,40); // 建立一個起始座標為 (40, 40) 的羊物件 s
    addKeyListener(this); // 註冊按鍵監聽器
}

@Override
public void paintComponent(Graphics g) {
    g.setColor(Color.BLACK); // 設定顏色為黑色
    g.fillRect(0,0,getWidth(),getHeight()); // 繪製一個填滿整個畫面的黑色矩形
    s.drawSheep(g); // 繪製羊物件 s
    requestFocusInWindow(); // 取得焦點，以便監聽鍵盤事件
}

public static void main(String[] args) {
    JFrame window = new JFrame(); // 建立 JFrame 物件 window
    window.setContentPane(new Main()); // 將 Main 物件加入到 JFrame 的 content pane 中
    window.setSize(500,500); // 設定視窗大小為 500x500
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 設定關閉視窗時的操作
    window.setVisible(true); // 顯示視窗
}


@Override
public void keyTyped(KeyEvent e) {

}

@Override
public void keyPressed(KeyEvent e) {
    int k = e.getKeyCode(); // 取得按下的按鍵代碼
    if (k == KeyEvent.VK_UP) { // 如果是上鍵
        s.walk(0,-5); // 讓羊向上移動 5 個像素
    }

    if (k == KeyEvent.VK_DOWN) { // 如果是下鍵
        s.walk(0,5); // 讓羊向下移動 5 個像素
    }
    if (k == KeyEvent.VK_RIGHT) { // 如果是右鍵
        s.walk(5,0); // 讓羊向右移動 5 個像素
    }
    if (k == KeyEvent.VK_LEFT) { // 如果是左鍵
        s.walk(-5,0); // 讓羊向左移動 5 個像素
    }
    repaint(); // 重繪畫面
}

@Override
public void keyReleased(KeyEvent e) {

}
}