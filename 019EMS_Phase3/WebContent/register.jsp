<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>Login and registration</title>
<link rel="stylesheet" href="css/jquery-ui.css">
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery-1.11.1.js"></script>
<script src="js/jquery-ui.js"></script>
<script type="text/javascript">
	 $(	function(){
				$("#tabs").tabs();
			}); 
</script>
</head>
<body bgcolor="red">

    
<div class="wrapper">	
	<div class="container">
	<div id="tabs">
	  <ul>
	    <li><a href="#login">Login</a></li>
	    <li><a href="#empDetails">Sign up</a></li>
	  </ul>
  <div id="login">

    <form method="post" action="LoginController">
    	<label for="email">Email:</label>
    	<br/>
    	<input type="text" name="email" id="email"/>
    	<br/>
    	<label for="password">Password:</label>
    	<br/>
    	<input type="password" name="password" id="password"  />
    	<br/>
    	<br/>
    	<input type="submit" value="Login">
    </form>
  </div><!-- login -->
  <div id="empDetails">
  	<form method="post" action="EmployeeServlet">
  	
		<ul>
		<li><label for="EmpID">EmployeeId :</label></li>
			<li><input type="text" name="employeeId" size="12" readonly="readonly"  value="${employee.employeeId}"/></li>
			
			<li><label for="KinID">KinId :</label></li>
			<li><input type="text" name="kinId" size="12" readonly="readonly"  value="${employee.kinId}"/></li>
			
			<li><label for="Name">Name :</label></li>
			<li><input type="text" name="employeeName" size="12" value="${employee.employeeName}"  required/></li>
			
			
			<li><label for="Email">Email:</label></li>
			<li><input type="email" name="emailId" size="50" value="${employee.emailId}"/></li>
			
			
			<li><label for="Address">Address:</label></li>
			<li><input type="text" name="address" size="50" value="${employee.address}" required/></li>
			
			<li><label for="Phone Number">Phone Number:</label></li>
			<li><input type="text" name="phoneNo" size="12" value="${employee.phoneNo}"  :required/></li>
			
			
			<li><label for="Date of Birth">Date of Birth:</label></li>
			<li><input type="text" name="dateOfJoining" size="10" value="<fmt:formatDate pattern="yyyy/MM/dd" value="${employee.dateOfJoining}" />" /></li>
			
			<li><label for="Date of Joining">Date of Joining:</label></li>
			<li><input type="text" name="dateOfBirth" size="10"  value="<fmt:formatDate pattern="yyyy/MM/dd" value="${employee.dateOfBirth}" />"/></li>
		<br>
				<li><select name="departmentId">
				<option selected="" value="${employee.departmentId}">(Please select a Department ID)</option>
					<option value="1001" value="Default">HR</option>
					<option value="1002">IT</option>
					<option value="1003">Finance</option>
					<option value="1004">Training</option>
					
				</select>
				<br>
			<br>
				
					<li><select name="projectId">
					<option selected="" value="${employee.projectId}">(Please select a project ID)</option>
					<option value="3001">EMS</option>
					<option value="3002" >ATM</option>
					<option value="3004">TALLY</option>
					
				</select>
				<br>
			<br>
				<li><select name="roleId">
				<option selected="" value="${employee.roleId}">(Please select a role id ID)</option>
					<option value="2001" >Manager</option>
					<option value="2002">Asst. Manager</option>
					<option value="2003">Developer</option>
					<option value="2004">Trainer</option>
					
				</select>
			</li>
		<li><input type="submit" value="Add" /></li>
 			
					<li><a href="index.html">Home</a></li>
		</ul>
  	</form>
  	</div><!-- register -->
		</div><!-- tab -->
	</div><!-- container -->
</div><!-- wrapper -->
</body>
</html>
