import java.awt.*;

public class Sheep {

private int x; // 羊的 x 座標
private int y; // 羊的 y 座標

public Sheep(int x,int y){
    this.x = x;
    this.y = y;
}

@Override
public String toString() {
    return this.x + ", " +this.y;
}

public void drawSheep(Graphics g) {
    g.setColor(Color.WHITE); // 設定繪圖顏色為白色
    g.fillOval(x+23,y+50,225,100); // 繪製羊的身體
    g.fillOval(x,y,75,75); // 繪製羊的頭
    g.fillRect(x+50,y+100,25,100); // 繪製羊的腿
    g.fillRect(x+100,y+100,25,100);
    g.fillRect(x+150,y+100,25,100);
    g.fillRect(x+200,y+100,25,100);
}

public void walk(int x,int y){
    this.x += x; // 調整羊的 x 座標
    this.y += y; // 調整羊的 y 座標
}

}
