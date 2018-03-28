package by.kolbun.andersen.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MainServlet.doGet()");

        String message = "test";

        req.setAttribute("message", message);

        req.getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
    }
}
