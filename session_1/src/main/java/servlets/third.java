package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "third", value = "/third")
public class third extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        List<String> list=(List<String>) session.getAttribute("first");
        String university=request.getParameter("userUniversity");
        String faculty=request.getParameter("userFaculty");
        String specialty=request.getParameter("userSpecialty");

        list.add(university);
        list.add(faculty);
        list.add(specialty);

        session.setAttribute("first",list);
        request.getRequestDispatcher("/third.jsp").forward(request,response);
    }
}
