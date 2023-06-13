public class Main {
    public static void main(String[] args) {
        Robot r = new Robot("RX-78-2", 2000);  // 創建一個名為 "RX-78-2"，製造年份為 2000 的機器人

        r.setYearMade(1999);  // 設定機器人的製造年份為 1999，但因為不在合理範圍內，會輸出錯誤訊息
        System.out.println(r.getYearMade());  // 取得機器人的製造年份並輸出，應該是 2000，因為設定的年份未成功

        r.setYearMade(2021);  // 設定機器人的製造年份為 2021，在合理範圍內
        System.out.println(r.getYearMade());  // 再次取得機器人的製造年份並輸出，應該是 2021
    }
}
