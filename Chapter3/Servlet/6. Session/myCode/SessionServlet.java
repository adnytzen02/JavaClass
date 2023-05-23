package myCode;

import Obj.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    private PreparedStatement preparedStatement;
    private PrintWriter out;

    @Override
    public void init() throws ServletException {
        initializeJDBC(); // 初始化JDBC
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8"); // 設定回應內容類型為HTML，編碼為UTF-8
        String bookId = request.getParameter("bookId"); // 從請求中取得書籍編號
        String name = request.getParameter("name"); // 從請求中取得書名
        String price = request.getParameter("price"); // 從請求中取得書籍價格
        String author = request.getParameter("author"); // 從請求中取得作者名稱

        Book book = new Book(); // 建立Book物件
        book.setBookId(Integer.parseInt(bookId)); // 將書籍編號設定到Book物件中
        book.setName(name); // 將書名設定到Book物件中
        book.setPrice(Integer.parseInt(price)); // 將書籍價格設定到Book物件中
        book.setAuthor(author); // 將作者名稱設定到Book物件中

        HttpSession httpSession = request.getSession(); // 取得HttpSession物件
        httpSession.setAttribute("book",book); // 將Book物件存入HttpSession中

        out = response.getWriter(); // 取得回應的PrintWriter物件
        out.println("You entered the following data"); // 印出使用者輸入的資料
        out.println("<p>Book Id: " + bookId + "</p>"); // 印出書籍編號
        out.println("<br />"); // 換行
        out.println("<p>Book Name: " + name + "</p>"); // 印出書名
        out.println("<br />"); // 換行
        out.println("<p>Book Price: " + price + "</p>"); // 印出書籍價格
        out.println("<br />"); // 換行
        out.println("<p>Book Author: " + author + "</p>"); // 印出作者名稱
        out.println("<br />"); // 換行

        out.println("<form method=\"post\" action=\"sessionRegis\">"); // 設定一個表單，使用POST方法提交到sessionRegis網址
        out.println("<input type=\"submit\" value=\"Confirm\">"); // 建立

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession httpSession = request.getSession();
    Book book = (Book) httpSession.getAttribute("book");

        try {
            storeBook(book.getBookId(), book.getName(), book.getPrice(), book.getAuthor());
            out = response.getWriter();

            out.println("Book " + book.getName() + "已儲存至資料庫。");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 初始化 JDBC
    private void initializeJDBC() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驅動程式載入中...");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wilsonvideodb", "wilsonvideo","password");
            System.out.println("資料庫連線成功...");

            preparedStatement = conn.prepareStatement("insert into Book " + "(bookId, name , price, author) values (?,?,?,?)");


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 儲存書籍資料至資料庫
    private void storeBook(int id,String name,int price, String author) {
        try {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, price);
            preparedStatement.setString(4, author);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}