<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Hibernate Integration MVC  | Edit User Details</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Spring Hibernate Integration MVC  |
			Edit Details</div>



		<c:url var="employeeRegistration" value="saveEmployee.html" />
		<form:form id="registerForm" modelAttribute="employee" method="post"
			action="update">
			<table width="400px" height="400px">
				<tr>
					<td><form:label path="empId">Employee Id</form:label></td>
					<td><form:input path="empId" /></td>
				</tr>
				<tr>
					<td><form:label path="emailId">Email Id</form:label></td>
					<td><form:input path="emailId" /></td>
				</tr>
				<tr>
					<td><form:label path="address">Address</form:label></td>
					<td><form:textarea path="address" /></td>
				</tr>
				<tr>
					<td><form:label path="phone">Address</form:label></td>
					<td><form:textarea path="phone" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" />
					</td>
				</tr>
			</table>
		</form:form>


		
	</center>
</body>
</html>
