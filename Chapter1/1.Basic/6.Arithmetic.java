public class Arithmetic {

    static void operation() {
        System.out.println((15 + "35").getClass());  // 輸出字串與整數相加的結果型態
        System.out.println(15+35+"15"+15+35);       // 輸出連續的數值運算結果

    }

    public static void main(String[] args) {
        System.out.println(15 + 35);          // 輸出兩個整數相加的結果
        System.out.println(15 + "35");        // 輸出整數與字串相加的結果
        System.out.println("25" + "35");      // 輸出兩個字串相加的結果
        System.out.println(9/10);             // 輸出整數除法的結果
        
        operation();                          // 呼叫operation()
    }
}
