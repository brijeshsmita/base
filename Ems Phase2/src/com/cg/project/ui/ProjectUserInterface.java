package com.cg.project.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.cg.department.services.DepartmentServices;
import com.cg.employee.domain.Employee;
import com.cg.employee.services.EmployeeServices;
import com.cg.employee.services.IEmployeeServices;
import com.cg.exception.EmsException;
import com.cg.project.domain.Project;
import com.cg.project.services.ProjectService;
import com.cg.util.DateUtil;
import com.cg.validate.Validate;

public class ProjectUserInterface {
	private static ProjectService projectservice;
	private static DepartmentServices departmentservice;
	static Validate validateEmp;
	//private static Employee employee;
	
	//static init block
	static
	{
		//employee = new Employee();
		projectservice= new ProjectService();
		departmentservice= new DepartmentServices();
		validateEmp=new Validate();

	}
	
	public static ProjectService getProjectservice() {
		return projectservice;
	}
	public static void setProjectservice(ProjectService projectservice) {
		ProjectUserInterface.projectservice = projectservice;
	}
	public static DepartmentServices getDepartmentservice() {
		return departmentservice;
	}
	public static void setDepartmentservice(DepartmentServices departmentservice) {
		ProjectUserInterface.departmentservice = departmentservice;
	}
	public static Validate getValidateEmp() {
		return validateEmp;
	}
	public static void setValidateEmp(Validate validateEmp) {
		ProjectUserInterface.validateEmp = validateEmp;
	}
	public static void addProject() throws EmsException {
		// TODO Auto-generated method stub
		projectservice.addProject(input("add"));
	}
	/*public static Project inputForAdd(){
		Project project = new Project();
		Scanner scan = new Scanner(System.in);		
		//String ename, grade;
		Date dob,doj;
		System.out.println("Enter Project name");
		project.setProjectName(scan.next());
		
		System.out.println("Enter Project Desc");
		project.setProjectDescription(scan.next());
		
		System.out.println("Enter Department Id");
		project.setDeptId(scan.nextInt());
	
		return project;
	}*/
	public static Project input(String str) throws EmsException{
		Project  project  = new Project ();
		Scanner scan = new Scanner(System.in);		
		String projectDesc,projectName;
	
		if(str.equals("modify"))
		{
			System.out.println("Enter project Id");
			project.setProjectId(scan.nextInt());
		}
		
		do
		{
			System.out.println("Enter project name");
			projectName=scan.next();
			project.setProjectName(projectName);
		}while(validateEmp.checkEmpName(projectName)==false);
		
		do
		{
			System.out.println("Enter Project Description (Only 200 characters are allowed)");
			projectDesc=scan.next();
			project.setProjectDescription(projectDesc);
		}while(validateEmp.checkDescription(projectDesc)==false);
		
		System.out.println("Enter Department Id");
		departmentservice.showAllDeptId();
		project.setDeptId(scan.nextInt());
		
		
		
		return project;
	}
	public static void modifyProject() throws EmsException {
		System.out.println(projectservice.modifyProject(input("modify")));
		
	}

	public static void removeProject() {
		Scanner scan = new Scanner(System.in);
		int projectId;
		System.out.println("Enter Project Id");
		projectId=scan.nextInt();	
		try {
			projectservice.removeProject(projectId);
		} catch (EmsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void getAllProject() {
		ArrayList<Project> projectList=null;
		try {
			projectList = projectservice.listAllProject();
		} catch (EmsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(projectList!=null){
			for(Project p : projectList){
				System.out.println(p);
			}
		}
		
	}

	public static void searchProject() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter project Id : ");
		int projectId=scan.nextInt();
		Project project=null;
		try {
			project = projectservice.searchProject(projectId);
		} catch (EmsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(project!=null){
			System.out.println("==============project Found!============\n"
					+project);
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong project does not Exists");
	}
		
	}
	


