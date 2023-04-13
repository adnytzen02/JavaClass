/*
HashSet 是項目的集合，其中每個項目都是唯一的。
*/

import java.util.HashSet; // Import the HashSet class

public class JavaHashSet {
    public static void main(String[] args) {
        // 建立一個 HashSet <String> 數組
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Toyota");
        cars.add("BMW");

        // 在上面添加兩次 BMW，但也會出現一次，因為集合中每個項目都只能是唯一
        System.out.println(cars);

        // 檢查項目是否存在
        System.out.println("項目是否存在 " + cars.contains("Ford"));

        // 列表有多少項目
        System.out.println("總共有 " + cars.size() + " 項");

        // 使用 for- each循環項目
        for (String i : cars) {
            System.out.println(i);
        }

        // 刪除項目
        System.out.println("刪除一個項目: Honda");
        cars.remove("Honda");
        System.out.println(cars);

        // 清空列表
        System.out.println("清空列表");
        cars.clear();
        System.out.println(cars);

        // 啟用 Num class
        Num num = new Num();
        num.newObj();
    }
}

class Num {
    static void newObj() {
        // 建立 HashSet <Integer> 數組
        HashSet<Integer> number = new HashSet<Integer>();

        // 添加項目
        number.add(5);
        number.add(1);
        number.add(8);

        // 檢查項目是否存在於 1 ~ 10
        for (int j = 0; j <= 10 ; j++) {
            if (number.contains(j)) {
                System.out.println(j + " 存在這個集合內!");
            } else {
                System.out.println(j + " 不存在這個集合內!");
            }
        }
    }
}