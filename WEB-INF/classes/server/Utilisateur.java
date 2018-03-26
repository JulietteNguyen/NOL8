package server;

public class Utilisateur {

	private int idUtilisateur;
	private String login;
	private String mail;
	private String mdp;
	
	public Utilisateur(int id, String login, String mail, String mdp){
		this.idUtilisateur=id;
		this.login=login;
		this.mail=mail;
		this.mdp=mdp;
		
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public String getmail() {
		return mail;
	}

	public String getMdp() {
		return mdp;
	}
}
