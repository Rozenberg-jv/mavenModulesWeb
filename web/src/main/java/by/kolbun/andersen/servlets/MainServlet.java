package by.kolbun.andersen.servlets;

import by.kolbun.andersen.DeveloperService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MainServlet extends HttpServlet {

    DeveloperService service = new DeveloperService();
    String message = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MainServlet.doGet()"); // dbg

        List developers = service.getAllDevelopers();

        req.setAttribute("message", message);
        req.setAttribute("developers", developers);

        req.getRequestDispatcher("/jsp/developers.jsp").forward(req, resp);
    }
}
