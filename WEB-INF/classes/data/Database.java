package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

import server.IDatabase;
import server.NOL8Server;
import server.Project;
import server.Task;
import server.Utilisateur;

//connexion a la bd + requetes
public class Database implements IDatabase {

	static {
		NOL8Server nol8 = NOL8Server.getInstance();
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:3404/NOL8", "postgres", "nol8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		nol8.setData(new Database());
	}

	private static Connection connection;

	private Database(){		
	}

	@Override
	public Utilisateur getUser(String mail, String password) {
		try{
			PreparedStatement req = connection.prepareStatement("SELECT * FROM utilisateur WHERE mail = ? AND mdp = ?");
			req.setString(1, mail);
			req.setString(2, password);
			ResultSet res = req.executeQuery();
			if (!res.next()){
				return null;
			}
			else{
				Utilisateur user = new Utilisateur(res.getInt("idUser"), res.getString("pseudo"), res.getString("mail"), res.getString("mdp"));
				return user;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}	
		return null;
	}

	@Override
	public ArrayList<Utilisateur> getAllUsersByProject(int idProject) {
		ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>();
		try{
			PreparedStatement req = connection.prepareStatement("SELECT * FROM UTILISATEUR INNER JOIN TRAVAILLESUR ON UTILISATEUR.iduser = ?");
			req.setInt(1, idProject);
			ResultSet res = req.executeQuery();
			
			while(res.next()){			
				Utilisateur user = new Utilisateur(res.getInt("idUser"), res.getString("pseudo"), res.getString("mail"), res.getString("mdp"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void giveTask(Task task) {
		// TODO Auto-generated method stub

	}

}
