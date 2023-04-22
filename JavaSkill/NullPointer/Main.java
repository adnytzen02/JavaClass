// 宣告一個公開的 Main 類別
public class Main {
    // 宣告一個靜態方法 main，並傳入參數 args
    public static void main(String[] args) {
        // 創建一個名為 wilson 的 Person 物件，年齡為 27 歲
        Person wilson = new Person("wilson", 27);
        // 創建一個名為 Alex 的 Person 物件，年齡為 25 歲
        Person Alex = new Person("Alex", 25);
        // 將 wilson 物件的配偶設為 Alex
        wilson.setSpouse(Alex);
        // 將 Alex 物件的配偶設為 wilson
        Alex.setSpouse(wilson);
        // 呼叫 wilson 物件的 talk() 方法，印出其對話內容
        wilson.talk();
    }
}