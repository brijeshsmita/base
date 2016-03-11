package com.cg.project.client.ui;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.management.relation.Role;

import com.cg.project.domain.Department;
import com.cg.project.domain.Employee;
import com.cg.project.service.EmployeeService;
import com.cg.project.service.IEmployeeService;
import com.cg.util.DateUtil;
public class EmployeeUserInterface {
	private static IEmployeeService employeeService;
	//private static Employee employee;
	
	//static init block
	static
	{
		//employee = new Employee();
		employeeService = new EmployeeService();
	}
	public static void addEmployee(){		
		//calling the addEmployee service of Employee
		employeeService.addEmployee(input());		
	}
	public static Employee input(){
		Employee employee = new Employee();
		Scanner scan = new Scanner(System.in);		
		//String ename, grade;
		Date dob;
		//int empNo,deptNo;
		System.out.println("Enter Employee Number");
		employee.setEmpNo(scan.nextInt());	
		System.out.println("Enter Employee name");
		employee.setEname(scan.next());
		System.out.println("Enter Employee Grade");
		employee.setGrade(scan.next());
		System.out.println("Enter Employee Date of Birth"
				+ " in following format yyyy/MM/dd");
		dob=DateUtil.convertStringToUtilDate(scan.next());
		employee.setDob(dob);
		System.out.println("Enter Department Number "
				+ "from the below Department List");
		DepartmentUserInterface.getAllDepartment();
		employee.setDeptNo(scan.nextInt());
		return employee;
	}
	public static void modifyEmployee(){		
		//calling the addEmployee service of Employee
		System.out.println(employeeService.modifyEmployee(input()));	
	}
	public static void removeEmployee(){
		Scanner scan = new Scanner(System.in);
		int empNo;
		System.out.println("Enter Employee Number");
		empNo=scan.nextInt();	
		employeeService.removeEmployee(empNo);
	}
	public static void getAllEmployee(){
		ArrayList<Employee> empList=employeeService.listAllEmployee();
		if(empList!=null){
			for(Employee e : empList){
				System.out.println(e);
			}
		}
	}

	public static void searchEmployee(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Number : ");
		int empNo=scan.nextInt();
		Employee employee = employeeService.searchEmployee(empNo);
		if(employee!=null){
			System.out.println("==============Employee Found!============\n"
					+employee);
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Employee does not Exists");
	}
	
}
