/**
 * 
 */
package edu.ieee.lahoresection.ieeebnu.action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ieee.lahoresection.ieeebnu.bl.ViewProjectBL;
import edu.ieee.lahoresection.ieeebnu.utils.DBConnectionUtil;

/**
 * @author Mehmood
 *
 */
public class ViewProjectsAction extends Action {

	@Override
	public String performAction(HttpServletRequest request,
			HttpServletResponse response, Connection connection)
			throws Exception {
		connection = DBConnectionUtil.openConnection();
	ViewProjectBL viewProjectBL = new ViewProjectBL(connection);
		request.setAttribute("Projects", viewProjectBL.getAllProjects());
		return "/projectList.jsp";
	}

}
