package book;

import Obj.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {

    private PreparedStatement preparedStatement;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        initializeJDBC();
        try {
            preparedStatement.setString(1,request.getParameter("bookId"));
            ResultSet rs = preparedStatement.executeQuery();
            Book book = null;
            if (rs.next()) {
                book = new Book();
                book.setBookId(rs.getInt("bookId"));
                book.setName(rs.getString("name"));
                book.setPrice(rs.getInt("price"));
                book.setAuthor(rs.getString("author"));
            }

            // 將 book 物件設定到 request 中，以便在 jsp 中使用
            request.setAttribute("book",book);
            request.getRequestDispatcher("/book.jsp").forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // 初始化 JDBC 相關設定
    private void initializeJDBC() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading...");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wilsonvideodb", "wilsonvideo","password");
            System.out.println("Database connected...");

            preparedStatement = conn.prepareStatement("select * from book where bookId = ?");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
