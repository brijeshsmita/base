<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<center>
<h2><b>Employee Details</b></h2>
<table border="2">
  <tr>
    <th>Employee Id</th>
    <th>KinId</th>
    <th>Employee Name</th>
     <th>Email Id</th>
    <th>Address</th>
    <th>Phone No</th>
    <th>Date Of Birth</th>
     <th>Date Of Joining</th>
    <th>Project Id</th>
    <th>Role Id</th>
    <th>Department Id</th>
    <th colspan="2">Action</th>
    
  </tr>
  <c:forEach var="e" items="${sessionScope.empList}">
  <tr>
    <td><c:out value="${e.employeeId}"/></td>
    <td><c:out value="${e.kinId}"/></td>
     <td><c:out value="${e.employeeName}"/></td>
        <td><c:out value="${e.emailId}"/></td>
    <td><c:out value="${e.address}"/></td>
     <td><c:out value="${e.phoneNo}"/></td>
        <td><c:out value="${e.dateOfJoining}"/></td>
    <td><c:out value="${e.dateOfBirth}"/></td>
     <td><c:out value="${e.projectId}"/></td>
     <td><c:out value="${e.roleId}"/></td>
     <td><c:out value="${e.departmentId}"/></td>
    <td><a href="EmployeeServlet?action=update&kinId=<c:out value="${e.kinId}"/>">Update</a></td>     
  <td><a href="EmployeeServlet?action=delete&kinId=<c:out value="${e.kinId}"/>">Delete</a></td>     
  
  
  </tr></c:forEach>
  
</table>
<h3>
 <td><a href="register.jsp">Add Employee</a></td>     
  <td><a href="index.html">Home</a></td> </h3>
  </center>