<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Contact</h1>
		<form:form commandName="Register" action="${pageContext.request.contextPath}/register.do" method="post" 
		modelAttribute="employee">
		<table>
			<form:hidden path="empId"/>
			<tr>
				<td>Name:</td>
				<td><form:input path="empName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="emailId" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneNo" /></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
			<tr>
				<td>DOJ:</td>
				<td><form:input path="doj" /></td>
			</tr>
			<tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Dept-Id:</td>
				<td><form:input path="deptId" /></td>
			</tr>
			<tr>
				<td>Project-Id:</td>
				<td><form:input path="projectId" /></td>
			</tr>
			<tr>
				<td>Role-Id:</td>
				<td><form:input path="roleId" /></td>
			</tr>
			<tr>
			
				<td colspan="2" align="center">
				<input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
	</div>
</body>
</html>