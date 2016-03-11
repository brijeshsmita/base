package com.ems.phase2.client.ui;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.ems.phase2.factory.EmployeeServiceFactory;
import com.ems.phase2.services.EmployeeService;
import com.ems.phase2.util.DateUtil;
import com.flp.ems.io.SaveEmployeeInFile;
import com.flp.ems.model.dept.Department;
import com.flp.ems.model.emp.Employee;
import com.flp.ems.model.project.Project;
import com.flp.ems.model.role.Role;
public class EmployeeUserInterface {
	private static EmployeeService service;
	//private static Employee employee;
	
	//static init block
	static
	{
		//employee = new Employee();
		service = EmployeeServiceFactory.getInstance();
	}
	public static void addEmployee(){
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);		
		String empName, emailId, phoneNo,  address;
		Date dob, doj;
		int deptId, projectId, roleId;
				
		System.out.println("Enter Employee name");
		empName=scan.next();employee.setEmpName(empName);
		System.out.println("Enter Employee emailId");
		emailId=scan.next();employee.setEmailId(emailId);
		System.out.println("Enter Employee PhoneNumber");
		phoneNo=scan.next();employee.setPhoneNo(phoneNo);
		System.out.println("Enter Employee Address");
		address=scan.next();employee.setAddress(address);
		System.out.println("Enter Employee Date of Birth"
				+ " in following format yyyy/MM/dd");
		dob=DateUtil.convertStringToUtilDate(scan.next());
		employee.setDob(dob);
		System.out.println("Enter Employee Date of Joining"
				+ " in following format yyyy/MM/dd");
		doj=DateUtil.convertStringToUtilDate(scan.next());
		employee.setDoj(doj);
		
		Department d1 = new Department();
		deptId=d1.getDeptId();
		employee.setDeptId(deptId);
		
		Project p1 = new Project();
		projectId=p1.getProjectId();
		employee.setProjectId(projectId);
		
		Role r1 = new Role();
		roleId= r1.getRoleId();
		employee.setRoleId(roleId);
		//calling the addEmployee service of Employee
		int result=service.addEmployee(employee);
		if(result==1)
		{
			System.out.println("Employee Added Successfully!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong while adding Employee");
	}
	public static void modifyEmployee(){		
		Scanner scan = new Scanner(System.in);		
		Employee employee = findEmployee();
		String emailId, phoneNo,  address;
		System.out.println("Enter Employee emailId");
		emailId=scan.next();employee.setEmailId(emailId);
		System.out.println("Enter Employee PhoneNumber");
		phoneNo=scan.next();employee.setPhoneNo(phoneNo);
		System.out.println("Enter Employee Address");
		address=scan.next();employee.setAddress(address);
		//calling the addEmployee service of Employee
		int result=service.modifyEmployee(employee);
		if(result==1)
		{
			System.out.println("Employee Modified Successfully!");
		}
		else{
				System.out.println("Sorry Boss! Something went"
						+ "wrong while modifying Employee");
		}
		
	}
	public static void removeEmployee(){
		Employee employee =findEmployee();
		int result=service.removeEmployee(employee);
		if(result==1)
		{
			System.out.println("Employee Removed Successfully!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong while removing Employee");

	}
	public static void getAllEmployee(){
		ArrayList<Employee> empList=service.getAllEmployee();
		if(empList!=null){
			for(Employee e : empList){
				System.out.println(e);
			}
		}
	}

	public static void searchEmployee(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int empId=scan.nextInt();
		Employee employee = service.searchEmployee(empId);
		if(employee!=null){
			System.out.println("Employee Found!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");
	}
	public static void searchEmployeeByKinId(){
		Employee employee =findEmployee();
		employee=service.searchEmployeeByKinId(employee.getKinId());
		if(employee!=null){
			System.out.println("Employee Found!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");
	}
	public static void searchEmployeeByName(){
		Employee employee =findEmployee();
		employee=service.searchEmployeeByName(employee.getEmpName());
		if(employee!=null){
			System.out.println("Employee Found!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");
	}
	public static void searchEmployeeByEmail(){
		Employee employee =findEmployee();
		employee=service.searchEmployeeByEmail(employee.getEmailId());
		if(employee!=null){
			System.out.println("Employee Found!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");

	}
	public static Employee findEmployee(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int empId=scan.nextInt();
		Employee employee = service.searchEmployee(empId);
		if(employee!=null){
			System.out.println("Employee Found!");
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");
		return employee;
	}
	public static void saveEmployee() {
		SaveEmployeeInFile.addEmployeeList(service.getAllEmployee());
	}	
}
