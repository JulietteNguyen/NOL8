package server;

import java.util.Date;

public class Task {
	
	private int id;
	private String nom;
	private String description;
	private Degre degre;
	private Etat etat;

	private Date dateFin;
	private Date dateDebut;
	private int idResponsable;
	private int idProjet;
	

	public Task(int id, String nom, String description, Degre degre, Etat etat, Date dateFin, Date dateDebut,
			int idResponsable, int idProjet) {
		
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.degre = degre;
		this.etat = etat;
		this.dateFin = dateFin;
		this.dateDebut = dateDebut;
		this.idResponsable = idResponsable;
		this.idProjet = idProjet;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public Degre getDegre() {
		return degre;
	}

	public Etat getEtat() {
		return etat;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public int getIdResponsable() {
		return idResponsable;
	}

	public int getIdProjet() {
		return idProjet;
	}
}
