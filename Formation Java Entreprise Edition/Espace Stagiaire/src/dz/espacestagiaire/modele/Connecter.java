package dz.espacestagiaire.modele;

import java.sql.*;

import dz.espacestagiaire.bean.Stagiaire;

public class Connecter {
	Connection connecte;

	public Connecter() {


		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connexion au serveur réussie");

		} catch (Exception e) {
			System.err.println("echec de connexion" + e.getMessage());
		}

		try {

			connecte = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/espace_stagiaire", "root", "");
			System.out.println("Connexion a la base réussie");

		} catch (Exception e) {
			System.err.println("echec de connexion a la base de donnees" + e.getMessage());

		}
	}
	public Connection connecterbase() {
		
		return connecte;
		
	}
	
}
