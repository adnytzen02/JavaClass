package myCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetFormServlet", value = "/GetFormServlet")
public class GetFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // 從GET請求中獲取參數
        String bookName = request.getParameter("name");
        String bookPrice = request.getParameter("Price");
        String bookAuthor = request.getParameter("author");

        // 使用PrintWriter將參數寫入HTML頁面中
        PrintWriter out = response.getWriter();
        out.println("<h3> Name: " + bookName + "</h3>");
        out.println("<h3> Price: " + bookPrice + "</h3>");
        out.println("<h3> Author: " + bookAuthor + "</h3>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 沒有實作doPost()方法，如果需要處理POST請求，就可以在這個方法中實現。
    }
}
