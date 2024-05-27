package ExerciciosServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex2
 */
@WebServlet("/Ex2")
public class Ex2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Obtenha o número da solicitação do parâmetro "numero"
        String numeroStr = request.getParameter("numero");
        
        try {
            int numero = Integer.parseInt(numeroStr);

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tabuada de Multiplicação</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tabuada de Multiplicação do Número " + numero + "</h1>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Multiplicador</th>");
            out.println("<th>Resultado</th>");
            out.println("</tr>");

for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

int resultado = numero * multiplicador;
out.println("<tr>");
out.println("<td>" + multiplicador + "</td>");
out.println("<td>" + resultado + "</td>");
out.println("</tr>");
}

out.println("</table>");
out.println("</body>");
out.println("</html>");

}
catch (NumberFormatException e) {
out.println("<html>");
out.println("<head>");
out.println("<title>Erro</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Erro: O valor fornecido não é um número inteiro válido.</h1>");
out.println("</body>");
out.println("</html>");
        }
    }
}

