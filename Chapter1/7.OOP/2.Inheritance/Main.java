public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Kite", 25, "Taipei", "Java");
        Student student1 = new Student("Alex", 16, "Taipei", 87);

        student1.learning();  // 學生學習的動作
        teacher1.walk();  // 老師走路的動作
    }
}