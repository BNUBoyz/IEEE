<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="menu_bar">
	<table style="margin: 0 auto; text-align: center;">
		<tr>
			<td>
				<ul class="modals">		
					<li><a href="<%= request.getContextPath() %>/dashboard.bnu">
						<img src="<%= request.getContextPath() %>/images/icons/home.png"
						width="36" height="36" alt="Home"><span>Home</span></a>
					</li>
		
					<li><a href="<%= request.getContextPath() %>/viewprojects.bnu">
						<img src="<%= request.getContextPath() %>/images/icons/prospect.png"
						alt="View Projects"> <span>View Projects</span> </a>
					</li>
					
					<li><a href="<%= request.getContextPath() %>/manageCourseAllocations.bnu">
						<img src="<%= request.getContextPath() %>/images/icons/prospect.png"
						alt="Manage Courses"> <span>Allocations</span> </a>
					</li>
					
					<li><a href="<%= request.getContextPath() %>/manageDegree.bnu">
						<img src="<%= request.getContextPath() %>/images/icons/prospect.png"
						alt="Manage Degree"> <span>Degree</span> </a>
					</li>
					
					<li><a href="<%= request.getContextPath() %>/manageCourseRegistrations.bnu">
						<img src="<%= request.getContextPath() %>/images/icons/prospect.png"
						alt="Manage Course Registrations"> <span>Registration</span> </a>
					</li>
					<li><a href="<%= request.getContextPath() %>/roadmap.bnu">
						<img src="<%= request.getContextPath() %>/images/icons/prospect.png"
						alt="Roadmap"> <span>Roadmap</span> </a>
					</li>
				</ul>
			</td>
		</tr>
	</table>
</div>