/*
ArrayList 是一個可以調整大小的樹組，可以在package裡找到java.util。
ArrayList 與Java中的數組區別在於 
    - ArrayList可以隨時添加、刪除元素。
    - 向Java中的數組添加或從數組中刪除元素，則必須創建一個新數組。
*/


import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections;  // Import the Collections class

public class Main {
    public static void main(String[] args){
        ArrayList<String> nba = new ArrayList<String>(); // 建立一個 ArrayList 
        nba.add("lakers");
        nba.add("bucks");
        nba.add("nets");
        nba.add("suns");

        System.out.println(nba); // 訪問數組
        System.out.println("第一個元素: " + nba.get(0)); // 訪問元素

        nba.set(0,"nuggets"); // 修改元素
        System.out.println("修改第一個元素: " + nba.get(0)); // 訪問修改後的元素

        // nba.size();  數組列表大小
        // 用 for 循環，使用 size() 指定運行多少次
        System.out.println("使用size()循環: ");
        for (int i = 0; i < nba.size(); i++) {
            System.out.println(nba.get(i));
        }

        // 也可以使用 ArrayList for -each 循環全部的元素
        System.out.println("循環全部的元素: ");
        for (String i : nba) {
            System.out.println(i);
        }

        Collections.sort(nba); // Sort nba
        System.out.println("循環排序後的元素");
        for (String  j : nba){
            System.out.println(j);
        }

        nba.remove(3); // 移除元素
        System.out.println("移除第四個元素: "+nba); 

        nba.clear();
        System.out.println("清空數組" + nba); // 清空數組

    }
}
