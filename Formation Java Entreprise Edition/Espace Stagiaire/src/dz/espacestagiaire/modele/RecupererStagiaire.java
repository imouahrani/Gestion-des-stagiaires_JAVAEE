package dz.espacestagiaire.modele;

import dz.espacestagiaire.bean.Stagiaire;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecupererStagiaire {

	public List<Stagiaire> getStagiaires() {
		List<Stagiaire> listesta = new ArrayList<Stagiaire>();

		java.sql.Statement sta;
		ResultSet resultat;
		Connecter connect = new Connecter();
		try {
			sta = connect.connecterbase().createStatement();
			resultat = sta.executeQuery("select * from stagiaire");
			while (resultat.next()) {

				int idstg = (int) resultat.getObject("idstg");
				String nomstg = (String) resultat.getObject("nomstg");
				String prenomstg = (String) resultat.getObject("prenomstg");
				String niveau = (String) resultat.getObject("niveau");
				String langage = (String) resultat.getObject("langage");

				Stagiaire stg = new Stagiaire();
				stg.setIdstg(idstg);
				stg.setNomstg(nomstg);
				stg.setPrenomstg(prenomstg);
				stg.setNiveau(niveau);
				stg.setLangage(langage);

				listesta.add(stg);

			}

		} catch (SQLException e) {
		}

		return listesta;
	}

}
