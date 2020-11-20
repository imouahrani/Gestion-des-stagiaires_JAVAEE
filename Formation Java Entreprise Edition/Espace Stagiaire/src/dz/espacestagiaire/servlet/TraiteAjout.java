package dz.espacestagiaire.servlet;
import dz.espacestagiaire.modele.*;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.espacestagiaire.bean.Stagiaire;
import dz.espacestagiaire.modele.MajStagiaire;

public class TraiteAjout extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nom, prenom, niveau, langage;
		nom = req.getParameter("nomstg");
		prenom = req.getParameter("prenomstg");
		niveau = req.getParameter("niveau");
		langage = req.getParameter("langage");
		
		Stagiaire stg = new Stagiaire();
		stg.setNomstg(nom);
		stg.setPrenomstg(prenom);
		stg.setNiveau(niveau);
		stg.setLangage(langage);
		MajStagiaire ms = new MajStagiaire();
		ms.AjoutStg(stg);
		
		
		TraiteStagiaire ts = new TraiteStagiaire();
		req.setAttribute("liste", ts);
		RecupererStagiaire rs = new RecupererStagiaire();
		req.setAttribute("ListeStagiaire", rs.getStagiaires());
		
		this.getServletContext().getRequestDispatcher("/AjoutStagiaire.jsp").forward(req, resp);



		
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	doGet(req, resp);
}
}
