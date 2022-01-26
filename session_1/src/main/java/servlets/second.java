package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "second", value = "/second")
public class second extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     HttpSession session=request.getSession();
     List<String> list=(List<String>) session.getAttribute("first");
     String country=request.getParameter("userCountry");
     String email=request.getParameter("userEmail");
     String phone=request.getParameter("userPhone");
     list.add(country);
     list.add(email);
     list.add(phone);
     session.setAttribute("first",list);
     request.getRequestDispatcher("/third.jsp").forward(request,response);

    }
}
