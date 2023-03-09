/*
Iterator 是一個可用於循環遍歷集合的對象，可用在 ArrayList、HashSet。
被稱為 "迭代器"，因為"迭代"是循環的技術術語。
*/

import java.util.ArrayList;
import java.util.Iterator;


public class javaIterator {
    public static void main(String[] args) {

        // 建立數組
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(21);
        num.add(15);
        num.add(36);
        num.add(5);
        num.add(13);

        // 啟用 iterator
        Iterator<Integer> it = num.iterator();

        // 循環集合
        while(it.hasNext()) {   // 使用hasNext()確認有無項目存在
            Integer i = it.next();
            if( i < 16 ) {
                it.remove();    // 項目小於 16 將其刪除
            }
        }
        System.out.println(num);    //打印結果
    }
}

//  不能使用 for 與 for -each 循環刪除項目將無法正常工作。
//  因為在代碼嘗試循環的同時集合正在更改大小。
