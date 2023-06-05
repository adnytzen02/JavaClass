public class ForLoop {
    public static void main(String[] args) {
        stringList(); // 使用stringList()方法
        counter(); // 使用counter()方法
    }

    static void stringList() {
        String[] people = {"Mike", "ALex", "Steve"};

        // 使用for-each迴圈遍歷字串陣列
        for (String person : people) {
            System.out.println(person); // 輸出陣列中的每個字串元素
        }
    }

    static void counter() {
        int counter = 0;

        // 使用for迴圈計數
        for (int i = 0; i < 20; i++) {
            counter++;
            System.out.println(i); // 輸出計數器的值
        }

        System.out.println(counter); // 輸出計數器的最終值
    }
}
