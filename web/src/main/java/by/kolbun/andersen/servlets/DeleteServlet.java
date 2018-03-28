package by.kolbun.andersen.servlets;

import by.kolbun.andersen.DeveloperService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    private DeveloperService service = new DeveloperService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        service.deleteDeveloper(id);

        resp.sendRedirect("/devs");
    }
}
