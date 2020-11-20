package dz.espacestagiaire.modele;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import dz.espacestagiaire.bean.Utilisateur;

public class RecupererUtilisateur {

	public List<Utilisateur> getUsers() {

		List<Utilisateur> listeutil = new ArrayList<Utilisateur>();
		Statement sta;
		ResultSet resultat;
		Connecter connect = new Connecter();
		try {
			sta =  connect.connecterbase().createStatement();
			resultat = sta.executeQuery("select * from utilisateur");
			while (resultat.next()) {

				String user = (String) resultat.getObject("username");
				String password = (String) resultat.getObject("password");
				Utilisateur util = new Utilisateur();
				util.setUsername(user);
				util.setPassword(password);
				listeutil.add(util);

			}

		} catch (SQLException e) {
			System.out.println("erreur recupere utilisateur"+e.getMessage());
		}

		return listeutil;
	}
	

}
