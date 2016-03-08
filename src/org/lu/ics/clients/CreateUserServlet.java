package org.lu.ics.clients;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.ejb.User;
import org.ics.facade.FacadeLocal;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/CreateUserServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	FacadeLocal facade;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");

		if (passWord.equals("") || userName.equals("")) {
			response.sendRedirect("error.jsp");
		} else {
			List<User> allUsers = facade.findAllUsers();
			String h = "good";
			for (User u : allUsers) {

				if (u.getUserName().equals(userName)) {
					response.sendRedirect("error.jsp");
					h = "bad";
				}
			}
			if (h.equals("good")) {
				User u1 = new User();
				u1.setUserName(userName);
				u1.setPassWord(passWord);

				facade.createUser(u1);
				response.sendRedirect("LogIn.jsp");

			}
		}
	}

}
