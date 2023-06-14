public class Teacher extends Person {
    private String subject;  // 教授的科目

    public Teacher(String name, int age, String address, String subject) {
        super(name, age, address);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + this.subject + ".....");  // 教授科目的動作
    }
}