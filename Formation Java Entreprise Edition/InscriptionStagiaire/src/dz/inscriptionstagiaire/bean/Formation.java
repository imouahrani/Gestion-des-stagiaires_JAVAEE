package dz.inscriptionstagiaire.bean;

public class Formation {

		private String intitule, formule, duree;
		private float prix;
		
		
		
		public Formation() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Formation(String intitule, String formule, String duree,
				float prix) {
			super();
			this.intitule = intitule;
			this.formule = formule;
			this.duree = duree;
			this.prix = prix;
		}
		
		public String getIntitule() {
			return intitule;
		}
		public void setIntitule(String intitule) {
			this.intitule = intitule;
		}
		public String getFormule() {
			return formule;
		}
		public void setFormule(String formule) {
			this.formule = formule;
		}
		public String getDuree() {
			return duree;
		}
		public void setDuree(String duree) {
			this.duree = duree;
		}
		public float getPrix() {
			return prix;
		}
		public void setPrix(float prix) {
			this.prix = prix;
		}
		
		
		
		
		
		
		
		
		
		
}







