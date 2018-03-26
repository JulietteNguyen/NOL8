package server;

public class Utilisateur {

	private int idUtilisateur;
	private String mail;
	private String mdp;
	
	public Utilisateur(int id, String mail, String mdp){
		this.idUtilisateur=id;
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
