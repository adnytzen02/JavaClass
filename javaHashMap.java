/*
ArrayList 數組將項目存儲為有序集合，必須使用索引號（int類型）訪問它們。
但是 HashMap，將項目存儲在 "Key/Value" 中，可以通過另一種 (String類型)訪問它們。
    一個對像用作另一個對象（值）的鍵（索引）。
    可以存儲不同類型：String鍵和Integer值，或相同類型，如：String鍵和String值
*/


import java.util.HashMap; // import the HashMap class


public class main {
    public static void javaHashMap(String[] args) {

        // 建立一個 HashMap 數組
        HashMap<String, Integer> nba = new HashMap<String, Integer>();

        // 添加項目: put()方法
        nba.put("Leborn", 6);
        nba.put("Curry", 30);
        nba.put("Durant", 35);

        // 訪問值，使用 get() 方法並引用 Key
        System.out.println(nba.get("Curry"));

        // 使用 for- each循環項目
        // 只想訪問Key值: keySet()，只想訪問value值: values()
        for (String i : nba.keySet()) {
            System.out.println("Key: " + i + " value: " + nba.get(i));
        }
    }
}
