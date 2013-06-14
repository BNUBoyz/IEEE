/**
 * 
 */
package edu.ieee.lahoresection.ieeebnu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import edu.ieee.lahoresection.ieeebnu.bean.Institution;
import edu.ieee.lahoresection.ieeebnu.bean.Project;

/**
 * @author Mehmood
 * 
 */
public class ProjectDAO {
	Connection connection;

	public ProjectDAO(Connection connection) {
		super();
		this.connection = connection;
	}
    public List<Project> selectAllProjects() throws SQLException
    {
    	
    	String sql ="Select * from project p " +
    			"JOIN institution i ON i.institution_id = p.Institution_institution_id";
    	Statement s = connection.createStatement();
    	ResultSet rs= s.executeQuery(sql);
    	List<Project> projectList = new ArrayList<Project>();
    	while(rs.next())
    	{
    		Project project =new Project();
    		project.setTitle(rs.getString("title"));
    		project.setShortlisted(rs.getBoolean("is_shortlisted"));
    		project.setProjectId(rs.getLong("project_id"));
    		project.setInstitutionId(rs.getLong("Institution_institution_id"));
    		project.setDescription(rs.getString("description"));
    		project.setCategory(rs.getString("category"));
    		 
    		Institution institution = new Institution();
    		
    		institution.setAddress(rs.getString("address"));
    		institution.setInstitutionId(rs.getLong("institution_id"));
    		institution.setName(rs.getString("name"));
    		institution.setPhoneNumber(rs.getString("phone_number"));
    		
    		project.setInstitution(institution);
    		
    		projectList.add(project);
    	
    	}
    	
    	rs.close();
    	s.close();
		return projectList;
    	
    }
}
