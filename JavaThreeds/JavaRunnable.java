/*
線程允許程序通過同時做多件事來更有效地運行。
線程可用於在後台執行複雜的任務，而無需中斷主程序。

"擴展"和"實施"線程之間的差異
    主要區別在於，當一個類擴展 Thread 類時，
    不能擴展任何其他類，但通過實現 Runnable 接口，也可以從另一個類擴展，
*/


public class Main {
    public static void main(String[] args) {
        Practice_1 practice_1 = new Practice_1();
        Thread thread = new Thread(practice_1);
        thread.start();
    }
}


class Practice_1 implements Runnable {
    static void demo_1() {
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
