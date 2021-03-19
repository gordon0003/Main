package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Cambio", urlPatterns = {"/Cambio"})
public class Cambio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CAMBIO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculadora de cambio</h1>");
            out.println("<form action='Cambio' method='post'>");
            out.println("<label>Monto : </label>");
            out.println("<input type='text' name='monto'>");
            out.println("<br>");
            out.println("<input type='radio' name='dinero' value='bol' id='bol'>");
            out.println("<label>Bs a Us</label>");
            out.println("<br>");
            out.println("<input type='radio' name='dineros' value='dol' id='dol'>");
            out.println("<label>Us a Bs</label>");
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
            String pesos = request.getParameter("monto");
            double bo = Integer.parseInt(pesos);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LOS RESULTADOS</title>");
            out.println("</head>");
            out.println("<body>");
            String boli = request.getParameter("dinero");
            String dola = request.getParameter("dineros");
            String su = request.getParameter("monto");
            if (boli == null  ) {
                out.println("<p>" + bo + " Dolares  = " + (bo * 6.9) + " Bolivianos</p>");
            } else {
                out.println("<p>" + bo + " Bolivianos  = " + (bo / 6.9) + " Dolares </p>");
            }
            out.println("<br>");
            out.println("<a href='Cambio'>Volver a calcular</a>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
