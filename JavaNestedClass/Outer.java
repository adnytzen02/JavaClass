public class Outer {
    private int i = 0;
    private void printHello() {
        System.out.println("Hello");
    }

    class inner {
        void print() {
            System.out.println(i);
            printHello();
        }
    }
}