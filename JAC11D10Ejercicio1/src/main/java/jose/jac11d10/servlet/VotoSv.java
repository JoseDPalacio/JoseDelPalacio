package jose.jac11d10.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jose.jac11d10.logica.Controladora;
import jose.jac11d10.logica.Voto;

@WebServlet("/VotoSv")
public class VotoSv extends HttpServlet {

    private Controladora control = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("resultados", control.traerVotos());
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("$$$$$$--enVotoSv.doPost()");
        String votado = request.getParameter("voto");
        
        control.votar(votado);
        
        //llamada para mantenerse en la misma pagina
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
