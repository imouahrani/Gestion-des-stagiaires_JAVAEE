package dz.espacestagiaire.servlet;
import dz.espacestagiaire.modele.*;
import java.io.IOException;
import java.util.List;
import dz.espacestagiaire.bean.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TraiteStagiaire extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RecupererStagiaire r= new RecupererStagiaire();
		List<Stagiaire> listestg = r.getStagiaires();
       req.setAttribute("ListeStagiaire", listestg);
       this.getServletContext().getRequestDispatcher("/ListeStagiaire.jsp").forward(req, resp);
		
	}

}
