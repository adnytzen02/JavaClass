import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 彈出對話框，要求使用者輸入疫苗名稱，並將輸入的字串儲存到變數vaccine中
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包括AZ/BNT/Moderna/Janssen): ");
        vaccine = vaccine.toLowerCase(); // 將輸入的字串轉換為小寫，方便比較

        // 根據輸入的疫苗名稱顯示相應的疫苗資訊對話框
        if (vaccine.equals("az")) {
            JOptionPane.showMessageDialog(null, "AZ\n疫苗類型: 腸病毒疫苗\n劑量: 24");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\n疫苗類型: mRNA疫苗\n劑量: 30");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showMessageDialog(null, "Moderna\n疫苗類型: 腸病毒疫苗\n劑量: 15");
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showMessageDialog(null, "Janssen\n疫苗類型: 腺病毒疫苗\n劑量: 43");
        } else {
            JOptionPane.showMessageDialog(null, "無法辨識內容，請重新輸入內容!");
        }
    }
}
