/*
簡單的帳號和密碼的登錄驗證功能:

在運行時，程序會提示用戶輸入用戶名和密碼，並將輸入的值與固定的用戶名和密碼進行比較，
如果匹配成功，則顯示"登錄成功！"，
否則顯示"用戶名或密碼錯誤，請重新輸入！"。
*/

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "myusername";
        String password = "mypassword";
        
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入用戶名：");
        String inputUsername = input.nextLine();
        System.out.print("請輸入密碼：");
        String inputPassword = input.nextLine();
        
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("登錄成功！");
        } else {
            System.out.println("用戶名或密碼錯誤，請重新輸入！");
        }

        input.close();
    }
}
