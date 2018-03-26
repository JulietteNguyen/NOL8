package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import server.NOL8Server;
import server.Utilisateur;

public class Connexion extends HttpServlet{	


	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();


		String mail = request.getParameter("mail");
		String mdp = request.getParameter("mdp");

		NOL8Server nol8 = NOL8Server.getInstance();

		Utilisateur u = nol8.getUser(mail, mdp);
		if(u!=null){
			request.getSession().setAttribute("mail", mail);
			request.getSession().setAttribute("mdp", mdp);
			out.print("true");
		}
		else out.println("false");
		
	}         
}
