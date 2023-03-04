// Import the scanner class
import java.util.Scanner;

class javaUserInput {
    public static void main(String[] args) {
        String username = "myusername";
        String password = "mypassword";

        Scanner input = new Scanner(System.in);
        System.out.println("please input your username: ",username);
        String inputUsername = input.nextLine();
        System.out.println("please input your password: ",password);
        String inputPassword = input.nextLine();



        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login !!!");
        } else {
            System.out.println("your username or password error, please re-enter");
        }
    }
}