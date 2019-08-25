package app.servlets;

import app.model.Model;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;

public class ListServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Model model = Model.getInstance();
        List<String> names = model.list();
        request.setAttribute("userNames", names);

        RequestDispatcher rd = request.getRequestDispatcher("views/list.jsp");
        rd.forward(request, response);
    }
}
