package dz.premierprojet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PremiereServelet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			PrintWriter pw = resp.getWriter();
			pw.println("Coucou c'est Imene !!!");
			pw.println("<html><body>");
			pw.println("<h2>Mon premier cour JEE</h2>");
			pw.println("<p>Une servlet est une classe JAVA<br>qui hérite de htttp servlet</p>");
			pw.println("</body></html>");
	}

}
