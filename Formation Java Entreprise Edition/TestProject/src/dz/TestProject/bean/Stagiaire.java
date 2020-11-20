package dz.TestProject.bean;

public class Stagiaire {

	String nom, prenom, sexe, niveau;
	float note1, note2, moy;
	Formation f;

	public Stagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stagiaire(String nom, String prenom, String sexe, String niveau,
			float note1, float note2,float moy, Formation f) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.niveau = niveau;
		this.note1 = note1;
		this.note2 = note2;
		this.moy = moy;
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public float getNote1() {
		return note1;
	}

	public void setNote1(float note1) {
		this.note1 = note1;
	}

	public float getNote2() {
		return note2;
	}
	public float getMoy() {
		return moy;
	}

	public void setNote2(float note2) {
		this.note2 = note2;
	}
	public void setMoy(float moy) {
		this.moy = moy;
	}

	public Formation getF() {
		return f;
	}

	public void setF(Formation f) {
		this.f = f;
	}

}
