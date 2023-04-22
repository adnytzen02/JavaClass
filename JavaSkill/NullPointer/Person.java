// 宣告一個名為 Person 的類別
public class Person {
    // 宣告私有成員變數，包含名字、年齡和配偶
    private String name;
    private int age;
    private Person spouse;

    // 宣告建構子，用於初始化名字和年齡
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 宣告 talk() 方法，用於顯示此人物的對話內容
    public void talk() {
        // 檢查配偶是否為 null，若不為 null，則顯示名字和配偶的名字；否則，顯示名字和未婚狀態
        if (spouse != null) {
            System.out.println("Hello my name is " + name + " and my spouse is " + spouse.getName());
        } else {
            System.out.println("Hello my name is " + name + " and I am not yet married.");
        }
    }

    // 宣告 setSpouse() 方法，用於設置此人物的配偶
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    // 宣告 getName() 方法，用於取得此人物的名字
    public String getName() {
        return this.name;
    }

}