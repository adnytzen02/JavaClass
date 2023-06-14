public class Student extends Person {
    private int grades;  // 成績

    public Student(String name, int age, String address, int grades) {
        super(name, age, address);
        this.grades = grades;
    }

    public void learning() {
        System.out.println("Learning.....");  // 學習的動作
    }
    
    @Override
    public void walk() {
        System.out.println(this.name + " Walking.....");  // 覆寫父類別的走路方法，加上學生的姓名
    }
}


