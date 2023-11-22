/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package jose.jac11ejerciciointegrador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jose.jac11ejerciciointegrador.logica.Controladora;
import jose.jac11ejerciciointegrador.logica.Partido;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    Controladora control = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("resultadosPartido", control.verPartidos());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fecha = request.getParameter("fechaPartido");
        Long idEquipo1 = Long.parseLong(request.getParameter("nombreEquipo1"));
        Long idEquipo2 = Long.parseLong(request.getParameter("nombreEquipo2"));
        String punto = request.getParameter("puntos");

        Partido p = new Partido();
        p.setFecha(fecha);
        p.setEquipo1(control.verEquiposId(idEquipo1).get(0));
        p.setEquipo2(control.verEquiposId(idEquipo2).get(0));
        p.setResultado(punto);

        control.crearPartido(p);

        response.sendRedirect("index.jsp");
    }

}
