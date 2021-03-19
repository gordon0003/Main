package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Factorial", urlPatterns = {"/Factorial"})
public class Factorial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CALCULADORA DE FACTORIAL</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Factor de un numero</p>");
            out.println("<form action='Factorial' method='post'>");
            out.println("<label>Ingrese un numero :</label>");
            out.println("<input type='text' name='factorial'>");
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
            
            String factorial = request.getParameter("factorial");
            int x = Integer.parseInt(factorial);
            int a;
            a=1;
            
            for(int i = 1; i<=x;i++){
            a=a*i;
            }

            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LOS RESULTADOS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>El factorial es : "+ a +" </p>");
            out.println("<br>");
            out.println("<a href='Factorial'>Volver a calcular</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
