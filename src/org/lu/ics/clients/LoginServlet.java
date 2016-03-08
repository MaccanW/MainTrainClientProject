package org.lu.ics.clients;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.ejb.User;
import org.ics.facade.FacadeLocal;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	FacadeLocal facade;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        
        
       
        boolean result = facade.authenticateUser(userName, passWord);
        
        if(result == true){
        	request.getSession().setAttribute("userName", userName);
        	response.sendRedirect("CreateSchedule.jsp");
        }else{
        	response.sendRedirect("error.jsp");
        }
        
       
//        if (user != null) {
//            request.getSession().setAttribute("user", user);
//            response.sendRedirect("home");
//        }
//        else {
//            request.setAttribute("error", "Unknown user, please try again");
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
//        }
    }
	

}

