package servlets;

import db.DBManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "basket", value = "/basket")
public class basket extends HttpServlet {
    HashMap<String, Double> map = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String itemName = request.getParameter("name");
        double itemPrice = Double.parseDouble(request.getParameter("price"));

        map.put(itemName, itemPrice);


        DBManager.getConnection();
        request.setAttribute("list", DBManager.getItems());
        session.setAttribute("basket", map);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
