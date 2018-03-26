package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NOL8", "postgres", "nol8");
		
			PreparedStatement req = connection.prepareStatement("SELECT * FROM \"Utilisateur\" as \"u\", \"TravailleSur\" as \"t\" WHERE u.\"idUser\" = t.\"idUser\" AND t.\"idProjet\" = ?");
			req.setInt(1, 1);
			ResultSet res = req.executeQuery();
		
		while(res.next()){
			System.out.println(res.getString("pseudo"));
		}
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
	
		
}
