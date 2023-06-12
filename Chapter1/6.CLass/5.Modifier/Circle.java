public class Circle {
    protected double radius;  // 定義半徑欄位，使用 protected 修飾符可供子類別存取
    private static final double PI = 3.14;  // 定義靜態常數 PI，表示圓周率

    // 建構函式，接受半徑參數並初始化半徑欄位
    public Circle(double radius) {
        this.radius = radius;
    }

    // 取得半徑值並印出面積公式
    public double getPrint() {
        this.printFormula();  // 呼叫私有方法 printFormula
        return this.radius;
    }

    // 印出圓形面積公式的私有方法
    private void printFormula() {
        System.out.println("Circle area formula is pi * r square.");
    }
}


