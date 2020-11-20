package dz.projetbean.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.projetbean.bean.Produit;

public class TraiteProduit extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Produit p = new Produit();
		p.setIntitule("ecran");
		p.setCategorie("materiel informatique");
		p.setPrix(17000);
		p.setQuantite(30);
		req.setAttribute("idecran", p);
		this.getServletContext().getRequestDispatcher("/Produit.jsp").forward(req, resp);
		
	}

}
