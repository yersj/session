package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "remove", value = "/remove")
public class remove extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession session=request.getSession();
    HashMap<String, Double> map=(HashMap<String, Double>) session.getAttribute("list");
    String key=request.getParameter("key");
    map.remove(key);
    request.getRequestDispatcher("/basket.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
