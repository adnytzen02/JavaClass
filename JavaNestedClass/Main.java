public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.inner inner = outer.new inner();
        inner.print();
    }
}