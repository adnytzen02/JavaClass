public class Main {
    public static void main(String[] args) {
        basicList(); // 使用基本陣列的方法
        newList(); // 使用new關鍵字創建新陣列的方法
    }

    static void basicList() {
        System.out.println("basicList: ");
        String[] people = {"Mike","Alex","James","Rose"}; // 創建一個包含四個元素的字串陣列

        // 訪問陣列中的元素
        System.out.println(people[0]); // 輸出第一個元素 "Mike"
        System.out.println(people[1]); // 輸出第二個元素 "Alex"

        // 獲取陣列的長度
        System.out.println(people.length); // 輸出陣列的長度 4

        // 獲取陣列中最後一個元素
        System.out.println(people[people.length - 1]); // 輸出最後一個元素 "Rose"
    }

    static void newList() {
        System.out.println("\nnewList: ");
        String[] people = new String[6]; // 使用new關鍵字創建一個可以容納六個元素的字串陣列

        // 在指定位置添加元素
        people[0] = "Mike";
        people[1] = "Alex";
        people[2] = "James";

        // 訪問陣列中的元素
        System.out.println(people[0]); // 輸出第一個元素 "Mike"
        System.out.println(people[1]); // 輸出第二個元素 "Alex"
    }
}
