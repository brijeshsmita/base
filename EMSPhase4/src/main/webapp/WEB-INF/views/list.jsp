<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring Hibernate Integration MVC  | User Details</title>
	
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Spring Hibernate Integration MVC  | User
			Details</div>

		<c:if test="${!empty employeeList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					
					<td>Employee Id</td>
				    <td>KinId</td>
				    <td>Employee Name</td>
				    <td>Email Id</td>
				    <td>Address</td>
				    <td>Phone No</td>
				    <td>Date Of Birtd</td>
				    <td>Date Of Joining</td>
				    <td>Project Id</td>
				    <td>Role Id</td>
				    <td>Department Id</td>
				</tr>
				  <c:forEach var="emp" items="${employeeList}">
					  <tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
					    <td><c:out value="${emp.employeeId}"/></td>
					    <td><c:out value="${emp.kinId}"/></td>
					    <td><c:out value="${emp.employeeName}"/></td>
					    <td><c:out value="${emp.emailId}"/></td>
					    <td><c:out value="${emp.address}"/></td>
					    <td><c:out value="${emp.phoneNo}"/></td>
					    <td><c:out value="${emp.dateOfJoining}"/></td>
					    <td><c:out value="${emp.dateOfBirth}"/></td>
					    <td><c:out value="${emp.projectId}"/></td>
					    <td><c:out value="${emp.roleId}"/></td>
					    <td><c:out value="${emp.departmentId}"/></td>
					    <td><a href="edit?id=${emp.employeeId}">">Update</a></td>     
						<td><a href="delete?id=${emp.employeeId}">Delete</a></td>     
	  				</tr>
	  			</c:forEach>			
			</table>
		</c:if>
		<a href="form">Click Here to add new User</a>
	</center>
</body>
</html>
