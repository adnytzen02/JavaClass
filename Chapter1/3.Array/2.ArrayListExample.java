import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // 創建一個ArrayList並添加元素
        ArrayList<String> people = new ArrayList<>();
        people.add("Mike");
        people.add("Alex");
        people.add("James");
        people.add("Rose");

        // 輸出ArrayList的內容
        System.out.println(people);

        // 獲取ArrayList的大小
        System.out.println("數組的大小: " + people.size());

        // 訪問單個元素
        System.out.println("訪問單一個數組: ");
        System.out.println(people.get(0)); // 輸出第一個元素 "Mike"
        System.out.println(people.get(1)); // 輸出第二個元素 "Alex"

        // 更改指定位置的元素
        people.set(3, "Tim");
        System.out.println("將數組第4個元素更換: " + people.get(3)); // 輸出更換後的元素 "Tim"

        // 對ArrayList進行排序
        System.out.println("數組排序:");
        Collections.sort(people);
        for (String i : people) {
            System.out.print(i + " "); // 輸出排序後的元素 "Alex James Mike Tim"
        }

        // 刪除指定位置的元素
        System.out.println("\n刪除第4個元素: ");
        people.remove(3);
        System.out.println(people); // 輸出刪除後的ArrayList

        // 清空ArrayList
        System.out.println("清空數組: ");
        people.clear();
        System.out.println("數組內元素: " + people.size()); // 輸出ArrayList的大小為0
    }
}
