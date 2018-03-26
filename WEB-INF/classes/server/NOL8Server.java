package server;

import java.util.ArrayList;

public class NOL8Server {
	
	static{
		instance =  new NOL8Server();
	}
	
	private static NOL8Server instance;
	public static NOL8Server getInstance(){
		return instance;
	}

	private NOL8Server() {}

	private IDatabase data;

	public void setData(IDatabase data){
		if(this.data==null)
			this.data=data;
	}

	//méthodes de IDatabase

	public ArrayList<Utilisateur> getAllUsers(){
		return data.getAllUsers();
	} 

	public ArrayList<Project> getAllProjects() {
		return data.getAllProjects();
	}

	public Utilisateur getUser(String mail, String password){
		return data.getUser(mail,password);
	}


}


