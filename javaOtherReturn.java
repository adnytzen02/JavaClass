/*
    Java 的 Method 返回不同類型的參數:
        1.返回類型為 Object, 接收返回參數後. 強制轉換成相應的類型。 
        2.使用泛型標註返回類型。
*/


public class  javaOtherReturn {


    public static void main(String[] args) {
        
        
        int demo1Value1 = (Integer) demo1(1);
        String demo1Value2 = (String) demo1(2);
        boolean demo1Value3 = (Boolean) demo1(3);
        double demo1Value4 = (Double) demo1(4);


        System.out.println(demo1Value1);
        System.out.println(demo1Value2);
        System.out.println(demo1Value3);
        System.out.println(demo1Value4);



        int demo2Value1 = (Integer) demo2(1);
        String demo2Value2 = (String) demo2(2);
        boolean demo2Value3 = (Boolean) demo2(3);
        double demo2Value4 = (Double) demo2(4);


        System.out.println(demo2Value1);
        System.out.println(demo2Value2);
        System.out.println(demo2Value3);
        System.out.println(demo2Value4);
    }

    
    public static Object demo1(int type) {
        switch (type) {
            case 1:
                return new Integer(1);
            case 2:
                return new String("2");
            case 3:
                return new Boolean(false);
            case 4:
                return new Double(1.0);
        }
    }

    public static <T> T demo2(int type) {
        switch (type) {
            case 1:
                return (T) Integer(1);
            case 2:
                return (T) String("2");
            case 3:
                return (T) Boolean(false);
            case 4:
                return (T) Double(1.0);
        }
    }
}