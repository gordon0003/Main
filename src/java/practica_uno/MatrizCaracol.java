package practica_uno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MatrizCaracol", urlPatterns = {"/MatrizCaracol"})
public class MatrizCaracol extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MATRIZ</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Matriz Caracol</p>");
            out.println("<form action='MatrizCaracol' method='post'>");
            out.println("<label>Ingrese un numero :</label>");
            out.println("<input type='text' name='matriz'>");
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LOS RESULTADOS</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Matriz </h1>");
            int[][] matriz = new int[100][100];
            String m = request.getParameter("matriz");
            int n = Integer.parseInt(m);
            int inicio = 0;
            int nlimite = n - 1;
            int c = 1;
            while (c <= (n * n)) {
                for (int i = inicio; i <= nlimite; i++) {
                    matriz[inicio][i] = c++;
                }
                for (int i = inicio + 1; i <= nlimite; i++) {
                    matriz[i][nlimite] = c++;
                }
                for (int i = nlimite - 1; i >= inicio; i--) {
                    matriz[nlimite][i] = c++;
                }
                for (int i = nlimite - 1; i >= inicio + 1; i--) {
                    matriz[i][inicio] = c++;
                }
                inicio = inicio + 1;
                nlimite = nlimite - 1;
            }
            out.println("<table border='1' cellspacing='0'>");
            out.println("<p> <b> MATRIZ CARACOL N = " + n + " </b></p>");
            out.println("<tr>");
            for (int i = 0; i < n; i++) {
                out.println("\t");
                for (int j = 0; j < n; j++) {
                    out.println("<td>");
                    out.print(matriz[i][j] + "\t");
                    out.println("</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<a href='Principal'>Volver al menú</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
