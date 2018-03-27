package services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connexion extends HttpServlet{	


	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();


//		String mail = request.getParameter("mail");
//		String pass = request.getParameter("pass");

		out.println("<html>");
		out.println("<head>");

		out.println("<title>Connexion</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");
		//out.println("<h1>"+mail+" "+pass+"</h1>");
		out.println("<h1>WOOOOOOOOOO</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
//		NOL8Server nol8 = NOL8Server.getInstance();
//
//		Utilisateur u = nol8.getUser(mail, pass);
//		if(u!=null){
//			request.getSession().setAttribute("mail", mail);
//			request.getSession().setAttribute("pass", pass);
//			out.print("true");
//		}
//		else out.print("false");
	}         
}
