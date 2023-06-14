public class Person {
    protected String name;  // 姓名
    protected int age;  // 年齡
    protected String address;  // 地址

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        this.name = "A People";  // 預設姓名為 "A People"
        this.age = 0;  // 預設年齡為 0 歲
        this.address = "Taiwan";  // 預設地址為 "Taiwan"
    }

    public void walk() {
        System.out.println("Walking....");  // 走路的動作
    }

    public void sleep() {
        System.out.println("Sleeping......");  // 睡覺的動作
    }
}