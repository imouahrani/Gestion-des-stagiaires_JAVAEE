package dz.premierprojet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletjsp extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			String s = "rien";
			req.setAttribute("promoteur",s);
			this.getServletContext().getRequestDispatcher("/Majsp.jsp").forward(req, resp);
		}
}
