/**
 * 
 */
package edu.ieee.lahoresection.ieeebnu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.ieee.lahoresection.ieeebnu.bean.Group;
import edu.ieee.lahoresection.ieeebnu.bean.Institution;
import edu.ieee.lahoresection.ieeebnu.bean.Project;

/**
 * @author Mehmood
 * 
 */
public class GroupDAO {
	Connection connection;

	public GroupDAO(Connection connection) {
		super();
		this.connection = connection;
	}
	 public Group findGroupByProject(long projectId ) throws SQLException
	    {
	    	
	    	String sql ="Select * from `group` where Project_project_id = ?";
	    	PreparedStatement ps = connection.prepareStatement(sql);
	    	  ps.setLong(1, projectId);
	    	ResultSet rs= ps.executeQuery();
	    	
	    	Group group = null;
	    	if(rs.next())
	    	{
	    		group = new Group();
	    		
	    		group.setGroupId(rs.getLong("group_id"));
	    		group.setName(rs.getString("name"));
	    		group.setProjectId(projectId);
	    		
	    	
	    	}
	    	
	    	rs.close();
	    	ps.close();
			return group;
	    	
	    }
}
