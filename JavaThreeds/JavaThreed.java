/*
線程允許程序通過同時做多件事來更有效地運行。
線程可用於在後台執行複雜的任務，而無需中斷主程序。

"擴展"和"實施"線程之間的差異
    主要區別在於，當一個類擴展 Thread 類時，
    不能擴展任何其他類，但通過實現 Runnable 接口，也可以從另一個類擴展，
*/

public class Main extends Threed {
    public static void main(String[] args) {
        Main three = new Main();
        threed.start();
        SYstem.out.print("This code is outside of the thread");
    }

    public void run() {
        SYstem.out.print("This code is running in a thread");
    }
}