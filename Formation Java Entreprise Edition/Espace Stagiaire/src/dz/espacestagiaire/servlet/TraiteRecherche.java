package dz.espacestagiaire.servlet;

import dz.espacestagiaire.bean.*;
import dz.espacestagiaire.servlet.*;
import dz.espacestagiaire.modele.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.espacestagiaire.bean.Stagiaire;
import dz.espacestagiaire.modele.MajStagiaire;

public class TraiteRecherche extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if (req.getParameter("rechercher") != null) {

			int idstg = Integer.parseInt(req.getParameter("recherche"));
			MajStagiaire ms = new MajStagiaire();
			Stagiaire stg = ms.RechercherStg(idstg);
			req.setAttribute("i", stg);
			this.getServletContext()
					.getRequestDispatcher("/AjoutStagiaire.jsp")
					.forward(req, resp);
		}
		if (req.getParameter("supprimer") != null) {

			MajStagiaire ms = new MajStagiaire();
			ms.SupprimerStg(Integer.parseInt(req.getParameter("idstg")));

			this.getServletContext()
					.getRequestDispatcher("/AjoutStagiaire.jsp")
					.forward(req, resp);

		}
		if (req.getParameter("modifier") !=null);
		MajStagiaire ms = new MajStagiaire();
		Stagiaire stg = new Stagiaire();
		stg.setNomstg(req.getParameter("nom"));
		ms.modifierStagiaire( Integer.parseInt("idstg"),stg);
		this.getServletContext().getRequestDispatcher("/AjoutStagiaire.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
