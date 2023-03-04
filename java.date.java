// 使用的package
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JavaDate {
    // 建立不可修改的常量
    enum Day {  // enum是一個特殊的class，表示一組 constants(常量)
        LOCALDATE,
        LOCALTIME,
        LOCALDATETIME,
    }

    public static void main(String[] args) {
        // 建立 Scanner 輸入
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入: <LOACLDATE/LOCALTIME/LOCALDATETIME> 其中一項");
        
        // 檢查 Scanner 類別中是否有可用的輸入。
        String newInput = "";
        if (input.hasNext()) {
            newInput = input.next();
        }

        // 將輸入文字轉為大寫
        String upperInput = newInput.toUpperCase();

        // 
        if(Day.LOCALDATE.toString().equals(upperInput)) {
            choice(Day.LOCALDATE);
        } else if (Day.LOCALTIME.toString().equals(upperInput)) {
            choice(Day.LOCALTIME);
        } else if (Day.LOCALTIME.toString().equals(upperInput)) {
            choice(Day.LOCALDATETIME);
        }
        input.close();
    }

    // 選擇查看哪一個 class
    public static void choice(Day type) {
        switch (type) {
            case LOCALDATE:
                Date.getDate();
                break;
            case LOCALTIME:
                Time.getTime();
                break;
            case LOCALDATETIME:
                DateTime.getDateTime();
                break;
        }
    }
}

class Date {
    // 當前日期 class
    static void getDate() {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
    }
}

class Time {
    // 當前時間 class
    static void getTime() {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}

class DateTime {
    // 當前日期-時間 class
    static void getDateTime() {
        LocalDateTime myObj = LocalDateTime.now();
        // 將 日期-時間 格式化
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = myObj.format(myFormatObj);
        System.out.println(formattedDate);
    }
}
