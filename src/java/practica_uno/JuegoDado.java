
package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "JuegoDado", urlPatterns = {"/JuegoDado"})
public class JuegoDado extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>DADOS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Juego De Dados</h3>");
            out.println("<br>");
            out.println("<form action='JuegoDado' method='post'>");
            out.println("<h2>Tire los dados</h2>");
            out.println("<input type='submit' value='Tirar dados'>");
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
            int n =(int)(Math.random()*6+1);
            int m =(int)(Math.random()*6+1);
            
            int s = n+m;
            
            
           

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tire Los dados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Sacaste </p>");
            
            if(s==7 || s==11){
            out.println("<p>" + s +" </p>");
            out.println("<p>Ganaste </p>");
            }else{
            out.println("<p>" + s + " </p>");
            out.println("<p>Perdiste </p>");
            }
            out.println("<a href='JuegoDado'>Volver a jugar</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
