import java.sql.*;

public class Login {
    private Connection connection;
    
    public Login() {
        try {
            // 連接到MySQL資料庫
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "myuser", "mypassword");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void login(String username, String password) {
        try {
            // 準備SQL查詢，並使用用戶輸入的用戶名和密碼進行參數化
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            
            // 執行查詢
            ResultSet resultSet = statement.executeQuery();
            
            // 檢查結果集是否包含行
            if (resultSet.next()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect username or password.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
