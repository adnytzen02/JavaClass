public class Main {
    public static void main(String[] args) {
        /**
         * 創建一個新的 Person 物件，並使用方法鏈式呼叫設置物件的屬性值。
         * 可以看到，由於方法都返回 Person 物件本身，因此可以連續調用多個方法，使程式碼更為簡潔。
         */
        Person john = new Person();
        john.setAge(25).setGpa(3.95f).setMajor("CS").setName("Jhon");
    }
}
