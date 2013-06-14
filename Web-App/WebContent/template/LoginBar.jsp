<%@page import="edu.ieee.lahoresection.ieeebnu.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div id="login_bar">
<%
boolean result=false;
User user = null;
if(request.getSession().getAttribute("USER")!=null)
{result=true;
user = (User) request.getSession().getAttribute("USER");
}%>
	<table width="100%" cellpadding="0" cellspacing="0">
		<tr>
			<td width="46%" class="smallText">
				&nbsp;&nbsp;Welcome <b><% if(result){ %>
				<%= 	user.getName() %>
				<%	} %></b>	
			</td>
			<td width="54%">
				<table width="100%" cellspacing="0" cellpadding="0">
					<tr>
						<td width="30%"><strong>Fall-2013</strong></td>
						<td width="*" align="right" class="smallText">
							<a class="smallText" href="<%=request.getContextPath()%>/password.bnu">Change Password</a>&nbsp;|&nbsp;
							<a href="<%=request.getContextPath()%>/logout.bnu">Sign Out</a>&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</td>	
		</tr>
	</table>
</div>
