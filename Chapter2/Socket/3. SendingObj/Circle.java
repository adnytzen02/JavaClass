import java.io.Serializable;

/**
 * 表示圓形的類別，可序列化為物件
 */
public class Circle implements Serializable {
    private double radius; // 圓形的半徑

    /**
     * 建構一個具有指定半徑的圓形物件
     * @param radius 圓形的半徑
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 取得圓形的半徑
     * @return 圓形的半徑
     */
    public double getRadius() {
        return this.radius;
    }
}
