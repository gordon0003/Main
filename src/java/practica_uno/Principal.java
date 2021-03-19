
package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>PRACTICA 1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Elejir una opcion del menu</h1>");
            out.println("<form action='Edad' method='get'>");
            out.println("<input type='submit' value='Calculador de edad'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action='Factorial' method='get'>");
            out.println("<input type='submit' value='Calculadora factorial'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action='EdadII' method='get'>");
            out.println("<input type='submit' value='Calculadora de edad II'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action='Cambio' method='get'>");
            out.println("<input type='submit' value='Cambio de monedas'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action='Operaciones' method='get'>");
            out.println("<input type='submit' value='Operaciones matematica'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action='JuegoDado' method='get'>");
            out.println("<input type='submit' value='Jugar a dados'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action='MatrizCaracol' method='get'>");
            out.println("<input type='submit' value='Generar matriz caracol'>");
            out.println("</form>");
            out.println("<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
