public class Robot {
    private String name;        // 私有欄位，儲存機器人的名稱
    private int yearMade;       // 私有欄位，儲存機器人的製造年份

    public int getYearMade() {
        return yearMade;        // 取得機器人的製造年份
    }

    public void setYearMade(int yearMade) {
        if (yearMade < 1990) {
            System.out.println("Year < 1990, Please input 1991 ~ 2021.");
        } else if (yearMade > 2022) {
            System.out.println("Year > 2022, Please input 1991 ~ 2021.");
        } else {
            this.yearMade = yearMade;   // 設定機器人的製造年份，但限制在合理範圍內
        }
    }

    public Robot(String name, int yearMade) {
        this.name = name;               // 初始化機器人的名稱
        this.yearMade = yearMade;       // 初始化機器人的製造年份
    }

    public void setName(String name) {
        this.name = name;               // 設定機器人的名稱
    }

    public String getName() {
        return this.name;               // 取得機器人的名稱
    }
}
