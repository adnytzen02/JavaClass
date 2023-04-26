public class Person {
    /**
     * 姓名
     */
    private String name;
    
    /**
     * 年齡
     */
    private int age;
    
    /**
     * 專業
     */
    private String major;
    
    /**
     * GPA
     */
    private double gpa;

    /**
     * 設定姓名
     * @param name 姓名
     * @return 回傳 Person 物件本身，以利方法鏈式呼叫
     */
    public Person setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 設定年齡
     * @param age 年齡
     * @return 回傳 Person 物件本身，以利方法鏈式呼叫
     */
    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    /**
     * 設定專業
     * @param major 專業
     * @return 回傳 Person 物件本身，以利方法鏈式呼叫
     */
    public Person setMajor(String major) {
        this.major = major;
        return this;
    }

    /**
     * 設定 GPA
     * @param gpa GPA
     * @return 回傳 Person 物件本身，以利方法鏈式呼叫
     */
    public Person setGpa(float gpa){
        this.gpa = gpa;
        return this;
    }
}
