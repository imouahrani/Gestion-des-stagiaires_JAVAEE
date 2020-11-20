package dz.TestProject.servlet;

import dz.TestProject.bean.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TraiteFormation extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String sexe = req.getParameter("sexe");
		String niveau = req.getParameter("niveau");
		String formation = req.getParameter("formation");
		float note2 = Float.parseFloat(req.getParameter("note2"));
		float note1 = Float.parseFloat(req.getParameter("note1"));

 

		String intitule = req.getParameter("intitule");
		String duree = req.getParameter("duree");
		String formule = req.getParameter("formule");
		String prix = req.getParameter("prix");
		
		float moy = ((note1 + note2)/2);
		

		String message = " ";
		if (nom.trim().isEmpty() || prenom.trim().isEmpty()
				|| sexe.trim().isEmpty() || niveau.trim().isEmpty()
				|| formation.trim().isEmpty() ||  intitule.trim().isEmpty()
				|| duree.trim().isEmpty() || formule.trim().isEmpty()
				|| prix.trim().isEmpty()) {
			message = "Veuillez saisir les champs svp!";
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
			st.setSexe(sexe);
			st.setNiveau(niveau);
			st.setNote1((note1));
			st.setNote2((note2));
			
			st.setF(f);
			st.setMoy(moy);
			f.setIntitule(intitule);
			f.setFormule(formule);
			f.setDuree(duree);
			f.setPrix(Float.parseFloat(prix));
			st.setF(f);
			req.setAttribute("idst", st);
			this.getServletContext()
					.getRequestDispatcher("/WEB-INF/InfoFormation.jsp")
					.forward(req, resp);

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}