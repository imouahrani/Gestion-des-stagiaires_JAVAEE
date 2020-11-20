package dz.TestInscripStagiaire.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.TestInscripStagiaire.bean.Stagiaire;

public class TraiteStagiaire extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		

		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String numTel = req.getParameter("numTel");
		String email = req.getParameter("email");
		String message = "";

		if (nom.trim().isEmpty() || prenom.trim().isEmpty()
				|| numTel.trim().isEmpty() || email.trim().isEmpty()){
			
			message = " Veuillez remplir les champs";
			req.setAttribute("msg", message);
			this.getServletContext().getRequestDispatcher("/Stagiaire.jsp")
					.forward(req, resp);

		} else {

			message = "Inscription r�ussie!";
			req.setAttribute("msg", message);
			
			
			Stagiaire st = new Stagiaire();
			st.setNom(nom);
			st.setPrenom(prenom);
			st.setNumTel(numTel);
			st.setEmail(email);
			req.setAttribute("stg", st);
			this.getServletContext().getRequestDispatcher("/WEB-INF/InfoStagiaire.jsp")
					.forward(req, resp);


		}
			
			
			
			
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			doGet(req, resp);
		}
	
	
	
		
	}


