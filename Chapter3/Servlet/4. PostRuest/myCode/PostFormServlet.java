
package myCode;

import javax.servlet.;
import javax.servlet.http.;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "PostFormServlet", value = "/PostFormServlet")
public class PostFormServlet extends HttpServlet {
    private PreparedStatement preparedStatement;
PrintWriter out;

@Override
public void init() throws ServletException {
    initializeJDBC();
}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String bookId = request.getParameter("bookId"); //書籍ID
    String name = request.getParameter("name"); //書籍名稱
    String price = request.getParameter("price"); //書籍價格
    String author = request.getParameter("author"); //書籍作者

    storeBook(Integer.parseInt(bookId),name,Integer.parseInt(price),author); //儲存書籍資訊
    out = response.getWriter();

    out.println("書籍 " + name + "已儲存於資料庫中。"); //顯示訊息
    out.close();
}

private void initializeJDBC() { //初始化JDBC
    try {
        Class.forName("com.mysql.jdbc.Driver"); //載入JDBC驅動程式
        System.out.println("驅動程式載入中...");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wilsonvideodb", "wilsonvideo","password"); //連接資料庫
        System.out.println("已連接資料庫...");

        preparedStatement = conn.prepareStatement("insert into Book " + "(bookId, name , price, author) values (?,?,?,?)"); //預處理SQL語句

    } catch (ClassNotFoundException | SQLException e) {
        throw new RuntimeException(e);
    }
}

private void storeBook(int id,String name,int price, String author) { //儲存書籍資訊
    try {
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setInt(3,price);
        preparedStatement.setString(4,author);
        preparedStatement.executeUpdate(); //執行更新

    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}