public class Encapsulation {

    public static void main(String[] args) {
        // 建立 Person 和 Items 物件
        Person person = new Person();
        Items items = new Items();

        // 設定 Person 的名字
        String personName = person.setName("Jhon");

        // 設定 Items 的屬性值
        items.setName("Table");
        items.setYear(2018);
        items.setMoney(1590);

        // 輸出訊息
        System.out.println(personName + " 購買 " + items.getName() + " 它的出廠年份為 " + items.getYear() + " 金額為: " + items.getMoney() + " 元");
    }
}

class Person {
    // 定義 Person 的屬性名稱，並設定為私有
    private String name;

    // 設置 Person 的名字
    public void setName(String name) {
        this.name = name;
    }

    // 獲取 Person 的名字
    public String getName() {
        return this.name;
    }
}

class Items {
    // 定義 Items 的屬性名稱，並設定為私有
    private int year;
    private String name;
    private int money;

    // 設置 Items 的出廠年份
    public void setYear(int year) {
        // 如果出廠年份大於 2023，則將其設為 2023
        if (year > 2023) {
            this.year = 2023;
        } else if (year <= 2010) {  // 如果出廠年份小於等於 2010，則輸出訊息
            System.out.println("It's over 10 year");
        } else {  // 否則設定出廠年份為傳入的值
            this.year = year;
        }
    }

    // 設置 Items 的名稱
    public void setName(String name) {
        this.name = name;
    }

    // 設置 Items 的價格
    public void setMoney(int money) {
        this.money = money;
    }

    // 獲取 Items 的出廠年份
    public int getYear() {
        return this.year;
    }

    // 獲取 Items 的名稱
    public String getName() {
        return this.name;
    }

    // 獲取 Items 的價格
    public int getMoney() {
        return this.money;
    }
}


