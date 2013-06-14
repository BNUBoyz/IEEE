package edu.ieee.lahoresection.ieeebnu.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ieee.lahoresection.ieeebnu.action.Action;
import edu.ieee.lahoresection.ieeebnu.action.ActionName;
import edu.ieee.lahoresection.ieeebnu.action.DashboardAction;
import edu.ieee.lahoresection.ieeebnu.action.LogoutAction;
import edu.ieee.lahoresection.ieeebnu.action.ViewProjectsAction;

/**
 * Servlet implementation class SystemController
 */
public class SystemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SystemController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Action action = null;
		String path = "/index.jsp";

		try {
			String actionName = getActionName(request);

			if (actionName.equals(ActionName.dashboard.toString())) {
				action = new DashboardAction();

			} else if(actionName.equals(ActionName.viewprojects.toString())){
				action = new ViewProjectsAction();
			} else if(actionName.equals(ActionName.logout.toString())){
				action = new LogoutAction();
			}

			path = action.performAction(request, response, connection);

		} catch (Exception e) {
			e.printStackTrace();
			path = "/Error.jsp";
		} finally {

			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		/*
		 * forward the request to the resource path returned by action
		 */
		getServletContext().getRequestDispatcher(path).forward(request,
				response);
	}

	private String getActionName(HttpServletRequest request) {

		String requestURI = request.getRequestURI();
		int contextPathLength = request.getContextPath().length();
		String usecase = requestURI.substring(contextPathLength + 1,
				requestURI.lastIndexOf('.'));
		return usecase;
	}

}
