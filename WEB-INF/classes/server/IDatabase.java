package server;

import java.util.ArrayList;

public interface IDatabase {
	
	//Utilisateur
	Utilisateur getUser(String mail, String password);
	ArrayList<Utilisateur> getAllUsersByProject(int idProjet);
	
	//Projet
	ArrayList<Project> getAllProjects();
	
	//Task
	void giveTask(Task task);
	
	
	
	
	
}
