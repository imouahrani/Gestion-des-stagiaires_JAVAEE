package dz.LoginProjet.bean;

public class Inscription {
	String civilite, nom, prenom, tel, domaine, question, matin, aprem;

	public Inscription() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inscription(String civilite, String nom, String prenom, String tel,
			String domaine, String question1, String question2, String matin,
			String aprem) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.domaine = domaine;
		this.question = question1;

		this.matin = matin;
		this.aprem = aprem;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getMatin() {
		return matin;
	}

	public void setMatin(String matin) {
		this.matin = matin;
	}

	public String getAprem() {
		return aprem;
	}

	public void setAprem(String aprem) {
		this.aprem = aprem;
	}

}
