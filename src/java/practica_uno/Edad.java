
package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Edad", urlPatterns = {"/Edad"})
public class Edad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CALCULADOR DE EDAD</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos de la persona</h1>");
            out.println("<form action='Edad' method='post'>");
            out.println("<label>Nombre : </label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>Año de nacimiento :</label>");
            out.println("<input type='text' name='edad'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String edad = request.getParameter("edad");
            int miedad = Integer.parseInt(edad);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LOS RESULTADOS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mis datos son : </h1>");
            out.println("<p>Nombre : "+ nombre +" </p>");
            out.println("<p>Edad : "+ (2021-miedad) +" </p>");
            out.println("<br>");
            out.println("<a href='Edad'>Volver a calcular</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
