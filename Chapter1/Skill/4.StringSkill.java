public class StringSkill {

    /**
     * 分割字串的方法
     */
    public static void splitStr() {
        String s = "Hello, how are you doing today";  // 創建一個字串變數 s
        String[] myArr = s.split(" ");  // 使用空格分割字串 s，將結果存入字串陣列 myArr
        for (String x : myArr) {
            System.out.println(x);  // 輸出 myArr 的每個元素
        }
    }

    /**
     * 截取子字串的方法
     */
    public static void subStr() {
        String s = "Hello World";  // 創建一個字串變數 s
        s = s.substring(0, 4);  // 從索引 0 到索引 4 截取字串 s 的子字串（不包含索引 4）
        System.out.println(s);  // 輸出截取後的子字串
    }

    public static void main(String[] args) {
        splitStr();  // 呼叫 splitStr 方法
        subStr();  // 呼叫 subStr 方法
    }
}
