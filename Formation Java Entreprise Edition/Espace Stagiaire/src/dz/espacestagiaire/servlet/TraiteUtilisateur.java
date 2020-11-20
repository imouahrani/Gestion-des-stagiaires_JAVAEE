package dz.espacestagiaire.servlet;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.RecursiveAction;

import dz.espacestagiaire.bean.Utilisateur;
import dz.espacestagiaire.modele.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TraiteUtilisateur extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("inputuser");
		String password = req.getParameter("inputPassword");
		RecupererUtilisateur lu = new RecupererUtilisateur();
		java.util.List<Utilisateur> l = lu.getUsers();
		boolean trouve = false;
		String message = "";
		for (int i = 0; i < l.size(); i++) {
			if (username.equals(l.get(i).getUsername())
					&& password.equals(l.get(i).getPassword())) {
				trouve=true;
				break;

			}

		}
		if (trouve == true) {
			this.getServletContext().getRequestDispatcher("/Accueil.jsp")
					.forward(req, resp);

		} else {
			message = " username ou password incorrecte";
			req.setAttribute("erreur", message);
			this.getServletContext().getRequestDispatcher("/Login.jsp")
					.forward(req, resp);

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
