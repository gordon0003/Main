package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CALCULADORA</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CALCULADORA</h1>");
            out.println("<form action='Operaciones' method='post'>");
            out.println("<label>Introducir Primer numero : </label>");
            out.println("<input type='text' name='numero'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>Introducir Segundo numero : </label>");
            out.println("<input type='text' name='numeros'>");
            out.println("<br>");
            out.println("<br>");
            out.println("<select name='op'>");
            out.println("<option value='Suma'>Suma</option>");
            out.println("<option value='Resta'>Resta</option>");
            out.println("<option value='Multiplicacion'>Multiplicacion</option>");
            out.println("<option value='Division'>Division</option>");
            out.println("</select>");
            out.println("<label for=''>Operacion</label>");
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
            String num1 = request.getParameter("numero");
            String num2 = request.getParameter("numeros");
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            String Sum = "Suma";
            String Res = "Resta";
            String Mul = "Multiplicacion";
            String Div = "Division";
            String opl = request.getParameter("op");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LOS RESULTADOS</title>");
            out.println("</head>");
            out.println("<body>");
            if (opl.equals(Sum)) {
                out.println("<p>La Suma es : " + (n1 + n2) + "</p>");
            } else {
                if (opl.equals(Res)) {
                    out.println("<p> La Resta es : " + (n1 - n2) + "</p>");
                } else {
                    if (opl.equals(Mul)) {
                        out.println("<p> La Multiplicacion es : " + (n1 * n2) + "</p>");
                    } else {
                        if (opl.equals(Div)) {
                            out.println("<p>La Division es : " + (n1 / n2) + "</p>");
                        }
                    }
                }
            }
            out.println("<br>");
            out.println("<a href='Operaciones'>Calcular de nuevo</a>");
            out.println("<br>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
