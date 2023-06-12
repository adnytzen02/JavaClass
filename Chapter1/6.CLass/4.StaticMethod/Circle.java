public class Circle {
    private double radius;  // 定義私有變數 radius，用於表示圓的半徑
    private static final double PI = 3.14;  // 定義靜態常數 PI，表示圓周率

    // 無參數建構函式，呼叫帶參數建構函式並將半徑設定為預設值 1.0
    public Circle() {
        this(1.0);
    }

    // 帶參數建構函式，初始化半徑
    public Circle(double radius) {
        this.radius = radius;
    }

    // 取得圓的面積
    public double getArea() {
        return Circle.PI * Math.pow(this.radius, 2);
    }
}
