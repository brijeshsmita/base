package com.ems.phase3.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.ems.phase3.model.Employee;
import com.ems.phase3.service.EmployeeServiceImpl;
import com.ems.phase3.service.IEmployeeService;
import com.ems.phase3.util.DateParser;


public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/register.jsp";
	  private static String LIST_EMPLOYEE = "/showAll.jsp";
		Connection con=null;
    IEmployeeService service=null;
    String forward;
    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
		ServletContext application=config.getServletContext();
		DataSource ds=(DataSource) application.getAttribute("ds");
		try {
			con=ds.getConnection();	
			System.out.println("Con in doPost :"+con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service= new EmployeeServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println("Action : "+action);
		if(action.equals("show")){
			forward = LIST_EMPLOYEE;
			HttpSession session=request.getSession(true);
			ArrayList< Employee> empList =service.listAllEmployee(con);
			session.setAttribute("empList", empList);
		for(Employee e1:empList){
			System.out.println(e1);
		}
			/*RequestDispatcher rd = 
					request.getRequestDispatcher("/showAll.jsp");
			rd.include(request, response);*/
	}else if(action.equals("delete")){
		forward = INSERT_OR_EDIT;
		String kinid=null;
		kinid = request.getParameter("kinId");
		System.out.println("KinId "+ kinid);
		service.removeEmployee(kinid, con);	
		}
	else if(action.equals("update")){
		
forward = INSERT_OR_EDIT;

		String kinid=null;
		kinid = request.getParameter("kinId");
		System.out.println("KinId "+ kinid);
		Employee employee=service.searchByKinId(kinid, con);
		request.setAttribute("employee", employee);
	}
	else {            
        
		   doPost(request, response);
		      
		  }
				
				
		RequestDispatcher view = request.getRequestDispatcher(forward);
				
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	

		Date dob,doj;
		Employee e=new Employee();
		response.setContentType("text/html");
		System.out.println("Con in doPost :"+con);
		System.out.println(request.getParameter("dateOfBirth"));
		dob=DateParser.parseToSqlDate(request.getParameter("dateOfBirth"));
		doj=DateParser.parseToSqlDate(request.getParameter("dateOfJoining"));
		e.setEmployeeName(request.getParameter("employeeName"));
		e.setEmailId(request.getParameter("emailId"));
		e.setAddress(request.getParameter("address"));
		e.setDateOfBirth(dob);
		e.setDateOfJoining(doj);
		e.setDepartmentId(request.getParameter("departmentId"));
		e.setRoleId(request.getParameter("roleId"));
		e.setProjectId(request.getParameter("projectId"));
		e.setPhoneNo(request.getParameter("phoneNo"));
		String kid = request.getParameter("kinId");	
		String id=request.getParameter("employeeId");
		if(kid==null || kid.isEmpty()){				
			service.addEmployee(e, con);	
					
		}				
		else{			
					
		e.setEmployeeId(Integer.parseInt(id));
		e.setKinId(kid);
					
		service.modifyEmployee(e, con);		
				
		}
		RequestDispatcher rd = 
		request.getRequestDispatcher("/register.jsp");
		rd.include(request, response);
}
}
