public class StaticMethod {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);  // 創建一個半徑為 10 的 Circle 對象
        c1.getArea();  // 呼叫 c1 的 getArea 方法，計算並忽略返回值

        Circle c2 = new Circle();  // 創建一個半徑為預設值 1.0 的 Circle 對象
        c2.getArea();  // 呼叫 c2 的 getArea 方法，計算並忽略返回值
    }
}

