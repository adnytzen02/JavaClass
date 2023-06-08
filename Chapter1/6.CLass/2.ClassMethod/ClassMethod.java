public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);  // 創建一個半徑為10的Circle對象
        System.out.println(circle1.getArea());  // 輸出圓的面積
        Circle circle2 = new Circle();  // 創建一個半徑為預設值的Circle對象
        System.out.println(circle2.getArea());  // 輸出圓的面積
    }
}


