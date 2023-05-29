import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private ArrayList<User> users = new ArrayList<User>();
    
    public Login() {
        // 創建一些用戶，並將它們添加到用戶列表中
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
        users.add(new User("user3", "password3"));
    }
    
    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();
        
        User user = validateUser(enteredUsername, enteredPassword);
        
        if (user != null) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password.");
        }
        
        input.close();
    }
    
    private User validateUser(String enteredUsername, String enteredPassword) {
        for (User user : users) {
            if (user.getUsername().equals(enteredUsername) && user.getPassword().equals(enteredPassword)) {
                return user;
            }
        }
        
        return null;
    }
}
