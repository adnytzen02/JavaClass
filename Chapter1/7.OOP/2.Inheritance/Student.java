public class Student extends Person {
    private int grades;  // 成績

    public Student(String name, int age, String address, int grades) {
        super(name, age, address);
        this.grades = grades;
    }

    public void learning() {
        System.out.println("Learning.....");  // 學習的動作
    }
}


