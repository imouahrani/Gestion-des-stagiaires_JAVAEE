package dz.espacestagiaire.bean;

public class Utilisateur {

	private String username, password;

	public Utilisateur(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
