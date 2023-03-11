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
    }
}

class Type {
    static void demo_1(String str) {
        Pattern pattern = Pattern.compile(str, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit github!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}