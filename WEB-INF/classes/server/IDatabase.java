package server;

import java.util.ArrayList;

public interface IDatabase {
	
	//Utilisateur
	Utilisateur getUser(String mail, String password);
	ArrayList<Utilisateur> getAllUsers();
	
	//Projet
	ArrayList<Project> getAllProjects();
	
	//Task
	void giveTask(Task task);
	
	
	
	
	
}
