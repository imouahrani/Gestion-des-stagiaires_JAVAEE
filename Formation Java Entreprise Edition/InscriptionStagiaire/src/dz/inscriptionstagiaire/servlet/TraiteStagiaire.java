package dz.inscriptionstagiaire.servlet;

import java.io.IOException;
import dz.inscriptionstagiaire.bean.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TraiteStagiaire extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String numeroDeTel = req.getParameter("numtel");
		String email = req.getParameter("email");
		String message = "";
		if (nom.trim().isEmpty() || prenom.trim().isEmpty()) {
			message = "Erreur vous devez renseigner vos champs!";
			req.setAttribute("msg", message);
			this.getServletContext().getRequestDispatcher("/Inscription.jsp")
					.forward(req, resp);
		} else {
			message = "Inscription r�ussie!";
			req.setAttribute("msg", message);
			Stagiaire st = new Stagiaire();
			st.setNom(nom);
			st.setPrenom(prenom);
			st.setNumtel(numeroDeTel);
            st.setEmail(email);
            
			req.setAttribute("Stagiaire", st);
			this.getServletContext()
					.getRequestDispatcher("/WEB-INF/InfoStagiaire.jsp")
					.forward(req, resp);
			
			

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
