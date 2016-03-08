package org.lu.ics.clients;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.eao.UserEAO;
import org.ics.ejb.Exercise;
import org.ics.ejb.ExerciseRow;
import org.ics.ejb.ExerciseRowID;
import org.ics.ejb.User;
import org.ics.ejb.WorkoutDay;
import org.ics.ejb.WorkoutDayID;
import org.ics.ejb.WorkoutSchedule;
import org.ics.facade.FacadeLocal;

/**
 * Servlet implementation class MainTrainServlet
 */
@WebServlet("/MainTrainServlet")
public class MainTrainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private FacadeLocal facade;
	
    public MainTrainServlet() {
        super();
    }
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		out.println("<!DOCTYPE html><html><head>"); 
		out.println("<title>WorkoutSchedule</title>"); 
		out.println("<meta charset=\"ISO-8859-1\">"); 
		out.println("</head><body>"); 
		out.println("<h1>WorkoutSchedule</h1>");
		
		//Metoder:
		String userName = "Marcus";
		String passWord = "hejhej";
		
		User u = new User();
		u.setUserName(userName);
		u.setPassWord(passWord);
				
		facade.createUser(u);
	
		
		
		
		//Skapandet
		
		//SCHEMA
//		WorkoutSchedule ws1 = new WorkoutSchedule();
//		User u1 = facade.findUserByUserName("Elias");
//		out.println("<p>" + u1 + "</p>");
//		
//		ws1.setWsName("Träningschema nummer 1");
//		ws1.setWsType("Styrka");
//		ws1.setWsDescr("hihihi");
//		ws1.setUserName(u1.getUserName());
//		
//	
//		
//		facade.createWorkoutSchedule(ws1);
//		
		//ÖVNING
//		Exercise ex1 = new Exercise();
//		
//		ex1.setName("Squats");
//		//ex1.setExId(2);
//		ex1.setDescr("Fristående");
//		ex1.setEx_type("S");
//		
//		facade.createExercise(ex1);
		
		//DAG
//		WorkoutSchedule w = facade.findByWorkoutScheduleId(1);
////		
//		WorkoutDayID wdId = new WorkoutDayID();
//		WorkoutDay wd1 = new WorkoutDay();
//
//		wdId.setWdNbr(2);
//		wdId.setWsId(w.getWsId());
//		
//		wd1.setWdNbr(wdId);
//		wd1.setWdName("Tisdag");
//		wd1.setWdType("Legday");
//		
//		facade.createWorkoutDay(wd1);
		
		//RAD
//		WorkoutSchedule w = facade.findByWorkoutScheduleId(1);
//		WorkoutDayID wdID = new WorkoutDayID();
//		wdID.setWdNbr(2);
//		wdID.setWsId(w.getWsId());
//		
//		
//		WorkoutDay wd = facade.findByWorkoutDayId(wdID);
//		Exercise e = facade.findByExerciseId(3);
		//out.println(e);
		
	    //användare
//		User u = new User();
//		u.setUserName("Elias");
//		u.setPassWord("hej123");
		
//		facade.createUser(u);
		
		
//		ExerciseRowID exrID = new ExerciseRowID();
//		ExerciseRow exr = new ExerciseRow();
		//out.println(exr.getExercise());
		
//		exrID.setExrId(1);
//		exrID.setWdNbr(2);
//		exrID.setWsId(1);
//	
//		
//		
//		exr.setExrId(exrID);
//		exr.setEReps(5);
//		exr.setESets(5);
//		exr.setExId(e.getExId());
//		exr.setExercise(e);
//		out.println(exr.getExercise().getName());

		
		
//		facade.createExerciseRow(exr);
		
	//out.println();
//		out.println("<h2>" + w.getWsName() + "</h2>");
//		WorkoutSchedule www = facade.findByWorkoutScheduleId(1);
//		for(WorkoutDay wddd : www.getWorkoutDays()){
//		for(ExerciseRow exr10 : wddd.getExerciseRows()){
//			
//			out.println("<h3>" + exr10.getWorkoutDay().getWdName() + "</h3>");
//			out.println("<h4>" + exr10.getExercise().getName() + "</h4>");
//			out.println(exr10.getESets());
//			out.println(exr10.getEReps());	
//		}}
//		
		
		//Delete exerciseROw
//		ExerciseRowID bajs = new ExerciseRowID();
//		bajs.setExrId(2);
//		bajs.setWdNbr(1);
//		bajs.setWsId(1);
//	
//		facade.deleteExerciseRow(bajs);
		
		//hitta ws med id
//		WorkoutSchedule ws = facade.findByWorkoutScheduleId(1);
//		if(ws != null){
//			out.println("<h4> Hittade: ");
//			out.println(" " + ws.getWsId());
//			out.println(" " + ws.getWsName());
//			out.println(" " + ws.getWsDescr());
//			out.println(" " + ws.getWsType() + "</4>");
//		}
//		
//		out.println("<h2>Scheman</h2>");
		
		//hitta alla scheman
//		List<WorkoutSchedule>allWorkoutSchedules = facade.findAllWorkoutSchedules();
//		for(WorkoutSchedule wss : allWorkoutSchedules){
//			out.println("<h4>Hittade: "); 
//			out.println(" Namn: "+ wss.getWsName());
//			out.println(" - "+ wss.getWsDescr());
//			out.println(" - "+ wss.getWsType());
//			
//			out.println(" - "+ wss.getWsId() +"</h4>");
//		}
//		
//		out.println("<h2>Övningar</h2>");
		
		//Hitta övning med id
//		Exercise ex = facade.findByExerciseId(1);
//		if(ex != null){
//			out.println("<h4> Hittade: ");
//			out.println(" " + ex.getExId());
//			out.println(" " + ex.getName());
//			out.println(" " + ex.getDescr());
//			out.println(" " + ex.getEx_type() + "</4>");
//		}
		
		
		
		//Lista på alla övningar
//				List<Exercise>allExercises = facade.findAllExercises();
//				for(Exercise e1 : allExercises){
//					out.println("<h4>Hittade: "); 
//					out.println(" Namn: "+ e1.getName());
//					out.println(" - "+ e1.getDescr());
//					out.println(" - "+ e1.getEx_type());
//					out.println(" - "+ e1.getExId() +"</h4>");
//				}
//				
//		
//	
//		out.println("<h2>Dagar</h2>");
//		
		
		//Hitta träningsdag genom wsid
//		WorkoutSchedule w = facade.findByWorkoutScheduleId(1);
//		//WorkoutDay wd = facade.findByWorkoutDayId(w.getWsId(), 1);
//		
//		for(WorkoutDay wd10 : w.getWorkoutDays()){
//			out.println(wd10.getWdName());
//			out.println(wd10.getWdType());
//			
//		}
			
//		WorkoutSchedule w = facade.findByWorkoutScheduleId(1);
//		
//		WorkoutDayID wdId = new WorkoutDayID();
//		WorkoutDay wd1 = new WorkoutDay();
//
//		wdId.setWdNbr(2);
//		wdId.setWsId(w.getWsId());
//		wd1.setWdNbr(wdId);
//		wd1.setWdName("Måndag");
//		wd1.setWdType("Styrka");
//		
//		facade.createWorkoutDay(wd1);
		
		
		
		out.println("</body></html>");	
		
	}

}
