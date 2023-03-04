import java.time.LOCALDate;
import java.time.LOCALTime;
import java.time.LOCALDateTime;
import java.time.DateTimeFormatter;
import java.util.Scanner;


public class javadate {
    enum Day {
        LOCALDATE,
        LOCALTIME,
        LOCALDATETIME,
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入: ");
        String newInput = input.nextline();

        String upperInput = newInput.toUpperCase();

        if(Day.LOCALDATE == upperInput) {
            choice(LOCALDATE);
        } else if (Day.LOCALTIME == upperInput) {
            choice(LOCALTIME);
        } else {
            choice(LOCALDATETIME);
        }

        public static choice (String type) {
            switch (type) {
                case LOCALDATE:
                    Date input_1 = new Date();
                    input_1.getDate();
                    break;
                case LOCALTIME:
                    Time input_2 = new Time();
                    input_2.getTime();
                    break;
                case LOCALDATETIME:
                    DateTime input_3 = new DateTime();
                    input_3.getDateTime();
                    break;
            }
        }
    }

}
class Date {
    // 當前日期
    static void getDate() {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
    }
}

class Time {
    // 當前時間
    static void getTime() {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}

class DateTime {
    // 當前日期-時間
    static void getDateTime() {
        LocalDateTime myObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = myObj.format(myFormatObj);
        System.out.println(formattedDate);
    }
}