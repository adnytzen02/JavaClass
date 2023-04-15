public class Teacher  extends People {
    private String subject;

    public Teacher(String name,int age,String address, String subject) {
        super(name,age,address); //實際上是去拿到 people constructors 的值
        this.subject = subject;

    }

    public void teach() {
        // 加上 super 方便知道來源
        super.printHello(); // 指到 People.java 的 Object
        System.out.println("Teaching...");
    }
}
