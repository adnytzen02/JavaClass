package myCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TryServlet", value = "/TryServlet")
public class TryServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("正在呼叫初始化方法....."); // 初始化方法
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        super.service(request,response);
        System.out.println("正在呼叫服務方法...."); // 服務方法
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("正在呼叫銷毀方法....."); // 銷毀方法
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<p>這是來自 TryServlet 的段落。</p>"); // HTML 响应
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
