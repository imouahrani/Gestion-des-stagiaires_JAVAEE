package dz.TestInscripStagiaire.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.TestInscripStagiaire.bean.Formation;
import dz.TestInscripStagiaire.bean.Stagiaire;

public class TraiteFormation extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String numTel = req.getParameter("numTel");
		String email = req.getParameter("email");
		String intitule = req.getParameter("intitule");
		String prix = req.getParameter("prix");

		String duree = req.getParameter("duree");
		String formule = req.getParameter("formule");

		String message = "";

		if (nom.trim().isEmpty() || prenom.trim().isEmpty()
				|| numTel.trim().isEmpty() || email.trim().isEmpty()
				|| intitule.trim().isEmpty() || prix.trim().isEmpty()
				|| duree.trim().isEmpty() || formule.trim().isEmpty()) {

			message = " Veuillez remplir les champs";
			req.setAttribute("m", message);
			this.getServletContext().getRequestDispatcher("/Formation.jsp")
					.forward(req, resp);

		} else {

			message = "Inscription r�ussie!";
			req.setAttribute("m", message);
			

			Stagiaire st = new Stagiaire();
			Formation f = new Formation();

			st.setNom(nom);
			st.setPrenom(prenom);
			st.setNumTel(numTel);
			st.setEmail(email);
			
			f.setIntitule(intitule);
			f.setPrix(Float.parseFloat(prix));
			f.setDuree(duree);
			f.setFormule(formule);
			st.setF(f);
			req.setAttribute("stg", st);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/InfoFormation.jsp")
					.forward(req, resp);

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
