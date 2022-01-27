package servlets;

import db.DBManager;
import model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.DriverManager;

import static javax.swing.text.html.CSS.getAttribute;

@WebServlet(name = "MainServlet", value = "/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBManager.setConnection();
        request.setAttribute("allItems",DBManager.getAllItems());

        HttpSession session=request.getSession();
        Users user=(Users) session.getAttribute("CURRENT_USER");

        if(user!=null){
            request.getRequestDispatcher("/adminPanel.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
