public class People {
    protected String name;
    protected int age;
    protected String address;

    // Method Overloading
    // default constructors
    public People() {
        this.name = "A Person";
        this.age = 0;
        this.address = "Taiwan";
    }

    public People(String name,int age,String address) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("Walking....");
    }

    public void sleep() {
        System.out.println("Sleeping....");
    }

    public void printHello() {
        System.out.println("Hello from People class");
    }

    // 比較兩個人是否為同一人
    @Override
    public boolean equals(Object p) {
        if (p instanceof People) {
            People person = (People) p; // type conversion
            return this.age == person.age;
        } else {
            return false;
        }

    }

}
