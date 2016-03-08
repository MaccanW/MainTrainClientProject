package org.lu.ics.clients;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ics.facade.FacadeLocal;

/**
 * Servlet implementation class CreateSchedule
 */
@WebServlet("/CreateSchedule")
public class CreateSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    public CreateSchedule() {
//        super();
//    }
    
    
	@EJB
	FacadeLocal facade;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String descr = request.getParameter("descr");
		
	}

}
