package dz.TestProject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.TestProject.bean.Formation;
import dz.TestProject.bean.Stagiaire;

public class TraiteStagiaire extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String sexe = req.getParameter("sexe");
		String niveau = req.getParameter("niveau");
		String formation = req.getParameter("formation");
		float note1 = Float.parseFloat(req.getParameter("note1"));
		float note2 = Float.parseFloat(req.getParameter("note2"));
		
		String message = " ";
		if (nom.trim().isEmpty() || prenom.trim().isEmpty()
				|| sexe.trim().isEmpty() || niveau.trim().isEmpty()
				|| formation.trim().isEmpty()) {
			
			
			message = "Veuillez saisir les champs svp!";
				req.setAttribute("msg", message);
				this.getServletContext().getRequestDispatcher("/Stagiaire.jsp")
						.forward(req, resp);

			} else {
				
				
				message = "Inscription réussie!";
				Stagiaire st = new Stagiaire();
				st.setNom("nom");
				st.setPrenom("prenom");
				st.setSexe("sexe");
				st.setNiveau("niveau");
				st.setNote1(note1);
				st.setNote2(note2);
				req.setAttribute("idst", st);
				this.getServletContext()
						.getRequestDispatcher("/WEB-INF/InfoStagiaire.jsp")
						.forward(req, resp);


		}
	}
}
