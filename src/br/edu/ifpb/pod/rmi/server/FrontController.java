package br.edu.ifpb.pod.rmi.server;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifpb.pod.rmi.server.service.impl.AccessServiceImpl;

@SuppressWarnings("serial")
public class FrontController extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		//registro do serviço RMI
		try {
			Registry registry = LocateRegistry.createRegistry(8989);
			registry.bind("RMIAccessService", new AccessServiceImpl());
		}
		catch (RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}
	}

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
