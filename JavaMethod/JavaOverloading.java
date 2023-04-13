public class JavaMeParameter {
    
    static int addMethod(int x,int y) {
        return x + y;
    }

    // Method overlaoding 多個方法可以具有相同的名稱和不同的參數
    static double addMethod(double x,double y){
        return x + y;
    }

    static double addMethod

    public static void main(String[] args) {
        // Method retrun 
        int num1 = addMethod(5, 5);
        double num2 = addMethod(5.5, 4.5);
        System.out.println(num1);
        System.out.println(num2);
    }
}