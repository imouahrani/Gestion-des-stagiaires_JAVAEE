package dz.TestInscripStagiaire.bean;

public class Stagiaire {
	
	private String nom, prenom, numTel, email;
	private Formation f;
	public Stagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stagiaire(String nom, String prenom, String numTel, String email,
			Formation f) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.email = email;
		this.f = f;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Formation getF() {
		return f;
	}
	public void setF(Formation f) {
		this.f = f;
	}

	
}
