/*
正則表達式定義了字符串的模式。
正則表達式可以用來搜索、編輯或處理文本。
正則表達式並不僅限於某一種語言，但是在每種語言中有細微的差別。
Java 沒有內置的正則表達式類，但我們可以導入java.util.regex 包來處理正則表達式

java.util.regex 包主要包括以下三個類：
    Pattern類 - 定義模式（用於搜索）。
    Matcher類 - 用於搜索模式。
    PatternSyntaxException類 - 指示正則表達式模式中的語法錯誤。
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Type type = new Type();
        type.demo_1("github");
        type.demo_2();
    }
}

class Type {
    static void demo_1(String str) {
        // 定義搜索模式，第一個參數搜索哪個模式，第二個參數來指示搜索應該不區分大小寫。
        Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);

        // 在字符串中搜索模式。它返回一個 Matcher 對象，其中包含有關所執行搜索的信息。
        Matcher matcher = pattern.matcher("Visit github!");

        // 如果在字符串中找到模式，則該find()方法返回 true，如果未找到，則返回 false。
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }

    static void demo_2() {
        String line = "This is my github";
        String pattern = "(\\D*)(.*)";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        } else {
            System.out.println("No match!");
        }
    }

    static void demo_3() {
        private static final String 
    }
}
