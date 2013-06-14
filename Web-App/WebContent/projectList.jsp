
<%@page import="edu.ieee.lahoresection.ieeebnu.bean.Project"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%= request.getContextPath() %>/css/base.css" rel="stylesheet" type="text/css" />
<title>Course Registration System</title>
 <link href="<%= request.getContextPath() %>/css/demo_page.css" rel="stylesheet" type="text/css" />
<link href="<%= request.getContextPath() %>/css/demo_table.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" language="javascript" src="<%= request.getContextPath() %>/js/jquery.js"></script>
<script type="text/javascript" language="javascript" src="<%= request.getContextPath() %>/js/jquery.dataTables.js"></script>
	<script type="text/javascript" charset="utf-8">
			$(document).ready(function() {
				$('#example').dataTable( {
					"sDom": '<"top"iflp<"clear">>rt<"bottom"iflp<"clear">>'
				} );
			} );
	</script> 
</head>
<body>
	<div id="container">
	  	<div id="header">
	   	<jsp:include page="template/LoginBar.jsp" flush="true" /> 
	  		<jsp:include page="template/Header.jsp" flush="true" />   		
	    </div>   
	    <div id="page">
	    	<div id="content">
				<div id="page_header">IEEE Project List</div>							
				<div id="page_inner">
				<table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
	<thead>
		<tr>
			<th>Project Name</th>
			<th>University Name</th>
			<th>Group Name</th>
			<th>Project Description</th>
			<th>Project Status</th>
		</tr>
	</thead>
	<tbody>
	<% List<Project> projectList = (List<Project>) request.getAttribute("Projects");
	for ( Project project : projectList )
	{
	%>
		<tr class="gradeA">
			<td><%= project.getTitle() %></td>
			<td><%= project.getInstitution().getName() %></td>
			<td><%= project.getGroup().getName() %></td>
			<td><%= project.getDescription() %></td>
			<td class="center"><%= project.isShortlisted() %></td>
		</tr>
	<%} %>
		
	</tbody>
				
				</div>
			</div>
	    </div>
	</div>
</body>
</html>