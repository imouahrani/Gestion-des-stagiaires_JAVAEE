package dz.espacestagiaire.bean;

public class Stagiaire {
	
	private int idstg;
	private String nomstg, prenomstg, niveau, langage;
	public int getIdstg() {
		return idstg;
	}
	public void setIdstg(int idstg) {
		this.idstg = idstg;
	}
	public String getNomstg() {
		return nomstg;
	}
	public void setNomstg(String nomstg) {
		this.nomstg = nomstg;
	}
	public String getPrenomstg() {
		return prenomstg;
	}
	public void setPrenomstg(String prenomstg) {
		this.prenomstg = prenomstg;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage = langage;
	}
	public Stagiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stagiaire(int idstg, String nomstg, String prenomstg, String niveau,
			String langage) {
		super();
		this.idstg = idstg;
		this.nomstg = nomstg;
		this.prenomstg = prenomstg;
		this.niveau = niveau;
		this.langage = langage;
	}

}
