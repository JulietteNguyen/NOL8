package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
			PreparedStatement req = connection.prepareStatement("SELECT * FROM \"Utilisateur\" WHERE mail = ? AND mdp = ?");
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
	public ArrayList<Utilisateur> getAllUsersByProject(int idProjet) {
		ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>();
		try{
			PreparedStatement req = connection.prepareStatement("SELECT * FROM \"Utilisateur\" as \"u\", \"TravailleSur\" as \"t\" WHERE u.\"idUser\" = t.\"idUser\" AND t.\"idProjet\" = ?");
			req.setInt(1, idProjet);
			ResultSet res = req.executeQuery();
			while(res.next()){			
				liste.add(new Utilisateur(res.getInt("idUser"), res.getString("pseudo"), res.getString("mail"), res.getString("mdp")));
			}
			return liste;
		}catch(Exception e){
			e.printStackTrace();
		}
		return liste;
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
