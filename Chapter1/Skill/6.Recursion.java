public class Main {
    public static void printTimes(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("Times is " + i);  // 輸出當前次數
        printTimes(i - 1);  // 遞迴呼叫，將次數減1
        System.out.println("Finish Times is " + i);  // 遞迴回溯後，再次輸出當前次數
    }

    public static void main(String[] args) {
        printTimes(10);
    }
}
