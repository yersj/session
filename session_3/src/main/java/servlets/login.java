package servlets;

import db.DBManager;
import model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String email=request.getParameter("email");
       String password=request.getParameter("password");


        Users user=(Users) DBManager.getUser(email);
        String redirect="/login.jsp?emailError";
       if(user!=null){
           redirect="/login.jsp?passwordError";
           if((user.getPassword()).equals(password)){
               HttpSession session= request.getSession();
               session.setAttribute("CURRENT_USER",user);
               response.sendRedirect("/main");
           }else{
               request.getRequestDispatcher(redirect).forward(request,response);
           }
       }else{
           request.getRequestDispatcher(redirect).forward(request,response);
       }




    }
}
