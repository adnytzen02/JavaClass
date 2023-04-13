/*
信息可以作為參數傳遞給方法。參數充當方法內部的變量。
參數在方法名稱之後的括號內指定。
可以根據需要添加任意數量的參數，只需將它們用逗號分隔即可。
*/

public class JavaMeParameter {
    
    static void myMethod(String fname,int age) {
        System.out.println(fname + " is " + age);
    }

    static int addMethod(int x,int y) {
        return x + y;
    }

    // Method overlaoding 多個方法可以具有相同的名稱和不同的參數
    static double addMethod(double x,double y){
        return x + y;
    }

    static double addMethod

    public static void main(String[] args) {
        // 可以使用多個 Method
        myMethod("Jhon",54);
        myMethod("Alex",26);

        // Method retrun 
        int z = addMethod(5, 5);
        System.out.println(z);
    }
}