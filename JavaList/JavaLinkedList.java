/*
1. LinkedList 是一個集合，可以包含許多相同類型的對象，就像 ArrayList。
2. 可以用 ArrayList 相同的方式添加項目、更改項目、刪除項目和清除列表可以。
3. 雖然以相同的方式使用，但它們的構建卻截然不同。

ArrayLlst 的工作原理: 
    ArrayList內部有一個常規數組。添加元素時，會將其放入數組中。
    如果數組不夠大，則會創建一個更大的新數組來替換舊數組，然後刪除舊數組。

LinkedList 的工作原理:
    將物品存儲在<容器>中。
    該列表有一個指向第一個容器的鏈接，每個容器都有一個指向列表中下一個容器的鏈接。
    要向列表中添加一個元素，將該元素放入一個新容器中，並將該容器鏈接到列表中的其他容器之一。


通常需要訪問列表中的隨機項，會使用 LinkedList 操作。
*/


import java.util.LinkedList; // Import the LinkedList class


public class JavaLinkedList {
    public static void main(String[] args){
        LinkedList<String> nba = new LinkedList<String>(); // 建立一個 ArrayList 
        nba.add("lakers");
        nba.add("bucks");
        nba.add("nets");
        nba.add("suns");

        System.out.println(nba); // 訪問數組

        nba.addFirst("nuggets");
        nba.addLast("warriors");
        System.out.println("新增第一項與最後一項元素: " + "\n" + nba);

        nba.removeFirst();
        nba.removeLast();
        System.out.println("刪除第一項與最後一項元素: " + "\n" + nba);

        System.out.println("第一項元素: " + getFirst(nba));
        System.out.println("最後一項元素: " + getLast(nba));

    }
}