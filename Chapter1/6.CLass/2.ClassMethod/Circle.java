public class Circle {
    private double radius;

    // 無參數建構函式，將半徑設定為預設值
    public Circle() {
        radius = 1.0;
    }

    // 帶參數建構函式，初始化半徑
    public Circle(double newRadius) {
        radius = newRadius;
    }

    // 取得圓的面積
    public double getArea() {
        return Math.PI * radius * radius;
    }
}