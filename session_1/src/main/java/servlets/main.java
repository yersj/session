package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "main", value = "/main")
public class main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("first.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session= request.getSession();
        String name=request.getParameter("userName");
        String surname=request.getParameter("userSurname");
        String birthdate=request.getParameter("userBirthdate");
        List<String> list=new ArrayList<>();
        list.add(name);
        list.add(surname);
        list.add(birthdate);
        session.setAttribute("first",list);
        request.getRequestDispatcher("/second.jsp").forward(request,response);
    }
}
