package by.kolbun.andersen.servlets;

import by.kolbun.andersen.DeveloperService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("SpellCheckingInspection")
public class AddServlet extends HttpServlet {
    private DeveloperService service = new DeveloperService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String specialty = req.getParameter("specialty");
        int salary = Integer.parseInt(req.getParameter("salary"));

        int id = service.addNewDeveloper(name, specialty, salary);
        System.out.println("adding new dev with id: " + id);
        resp.sendRedirect("/devs");
    }
}
