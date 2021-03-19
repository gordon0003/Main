package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EdadII", urlPatterns = {"/EdadII"})
public class EdadII extends HttpServlet {

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
            out.println("<form action='EdadII' method='get'>");
            out.println("<label>Año de nacimiento :</label>");
            out.println("<input type='text' name='edad'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<a href='EdadII?edad=12'></a>");
            String edad = request.getParameter("edad");
            int edads = Integer.parseInt(edad);
            out.println("<p>Tienes : " + ( 2021-edads )+ " años</p>");
            out.println("<br>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>"); 

        }
    }
}
