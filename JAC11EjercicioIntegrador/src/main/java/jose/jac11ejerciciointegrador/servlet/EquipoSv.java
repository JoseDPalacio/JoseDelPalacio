package jose.jac11ejerciciointegrador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jose.jac11ejerciciointegrador.logica.Controladora;
import jose.jac11ejerciciointegrador.logica.Equipo;

@WebServlet(name = "EquipoSv", urlPatterns = {"/EquipoSv"})
public class EquipoSv extends HttpServlet {

    private Controladora control = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("resultadosEquipo", control.verEquipos());
        System.out.println("$$$$--En EquipoSv.doGet");

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreEquipo = request.getParameter("nombreEquipo");
        System.out.println(nombreEquipo);

        Equipo e = new Equipo();
        e.setNombre(nombreEquipo);

        control.crearEquipo(e);
        response.sendRedirect("index.jsp");
    }

}
