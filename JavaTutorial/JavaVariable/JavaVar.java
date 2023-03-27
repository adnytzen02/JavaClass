public class JavaVar {
    public static void main(String[] args) {
        Var();
        Int();
        Const();
    }

    // type variableName = value;
    
    public static void Var() {
        // Type = String
        String name = "Wall";
        System.out.println(name);

        // 組合文本 1 個變數
        System.out.println("Jhon" + name);

        // 組合文本 2 個變數
        String fristName = "Jhon";
        String lastName = "Wick";
        System.out.println(fristName + lastName);

    }

    public static void Int() {
        // Type = int
        int num_1 = 5;
        int num_2 = 6;
        System.out.println(num_1);
        System.out.println(num_2);

        // 數學運算
        System.out.println(num_1 * num_2);

        // 另一種寫法
        int myNum = 20;
        myNum = 30;
        System.out.println(myNum);

        // 使用多個變量
        System.out.println(num_1 * num_2 + myNum);

        // 一行內分配相同的值
        int x,y,z;
        x = y = z = 100;
        System.out.println(x + y + z);
    }

    public static void Const() {
        // final 定義不能覆蓋
        final double PI = 3.14;

        // 下面這行會報錯，因為 PI 已經是常數，不能再次賦值
        // PI = 3.14159;
        System.out.println(PI);
    }
}
