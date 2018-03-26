package server;

public class Project {

	private int id;
	private String nom;
	private String descriptif;
	
	public Project(int id, String nom, String descriptif){
		this.id=id;
		this.nom=nom;
		this.descriptif=descriptif;
		
	}
	
	public int getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}


	public String getDescriptif() {
		return descriptif;
	}



	
}
