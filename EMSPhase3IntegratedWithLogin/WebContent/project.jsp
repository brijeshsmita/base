<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" 
prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new user</title>
        <script type="text/javascript" src="js/project.js"></script>
         <script src="js/jquery-2.1.1.js" type="text/javascript"></script>
       <script type="text/javascript">
			$(document).ready(function () {                          
			    $('#deptId').click(function () {                 
			        $.get('PopulateDeptId', function (responseJson)
			        	{    
			            var $select = $('#deptId');                           
			            $select.find('option').remove();                          
			            $.each(responseJson, function (key, value) {               
			                $('<option>').val(key).text(value).appendTo($select); 
			            });
			        });
			    });
			              
			        
			});
		</script> 
    </head>
    <body style="background-color: cyan;">
        <form method="POST" action='ProjectServlet' 
        name="frmAddProject" onsubmit="return validateForm()">
           <table border=10 align="center" style="background-color: silver;"> 
            <% String action = request.getParameter("action");
                System.out.println(action);
            %>
            <tr>
            <% if (action.equalsIgnoreCase("edit")) {%>
            <td>Project Id :</td>
            <td> <input type="number" name="projectId"
                          value="<c:out value="${project.projectId}" />"
                           readonly="readonly"/> </td>
              <td>(You Can't Change this)</td>
            <%}else {%>
            <td><input type="number" name="projectId"
                          value="<c:out value="0" />"
                         readonly="readonly" style="visibility: hidden;"/><br /> 
           </td>
            <%}%>
            </tr>
            
            <tr>
           <td> Project Name : </td>
           <td><input type="text" name="projectName"
                value="<c:out value="${project.projectName}" />" /> 
            </td>
             </tr> 
              
              <tr>  
            <td>Project Description : </td>
            <td><input
                type="text" name="projectDescription"
                value="<c:out value="${project.projectDescription}" />" /> </td> 
             </tr>   
             <tr>
            <td>Department Id :</td>
            <td><select id="deptId" name="deptId">
                	<option>Id</option>
            </select>
            </td>
            </tr> 
                          
     	<tr>
           <td> <input  type="submit" value="Submit"  /></td>
        </tr>
            </table>
        </form>
    </body>
    
</html>






