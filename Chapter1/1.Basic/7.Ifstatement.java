public class Ifstatement {
    public static void main(String[] args) {
        int age = 20;
         if (age < 14) {
             System.out.println("年齡小於14歲");
         } else if ((age >=14 && age<18) || age > 80) {
             System.out.println("你的年齡在14 ~ 18歲之間，或超過80歲");
         } else {
             System.out.println("你的年齡在18歲到80歲之間");
         }
    }
}