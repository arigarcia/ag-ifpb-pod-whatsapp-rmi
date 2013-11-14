package br.edu.ifpb.pod.rmi.server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class FrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//parametro
	  String p = req.getParameter("p");
	  processRequest(p, req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  //paramentro
	  String p = req.getParameter("p");
	  processRequest(p, req, resp);
	}
	
	public void processRequest(String p, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//default
		if (p == null){
			p = "index";
		}
		//create action
		ActionFactory factory = new ActionFactory();
		Action action = factory.create(p);
		//get result page
		String page = action.execute(req);
		//attribute
		req.setAttribute("page", page + ".jsp");
	  //mapping
	  RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
	  dispatcher.forward(req, resp);
	}
	
}
