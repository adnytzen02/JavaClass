// 引入必要的套件
import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {
        // 建立三個 People 的物件，其中 s1 和 s2 為 Student 的物件，t1 為 Teacher 的物件
        People s1 = new Student("Jhon",20,"Taiwan",20);
        People s2 = new Student("Mike",20,"Taiwan",20);
        People t1 = new Teacher("Alex",30,"Taiwan","CS");

        // 建立 People 的 ArrayList 物件 people
        ArrayList<People> people = new ArrayList<>();

        // 將 s1, s2, t1 加入 people 中
        people.add(s1);
        people.add(s2);
        people.add(t1);

        // 使用 for 迴圈將 people 中的物件的 name 印出
        for (int i = 0;i < people.size();i++) {
            System.out.println(people.get(i).name);
        }
    }

}