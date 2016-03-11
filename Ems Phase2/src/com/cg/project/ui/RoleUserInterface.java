package com.cg.project.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.validate.Validate;
import com.cg.role.domain.Role;
import com.cg.role.services.IRoleServices;
import com.cg.role.services.RoleServices;



public class RoleUserInterface 
{
	private static IRoleServices roleService;
	static Validate validateEmp;
	
	static
	{
		validateEmp=new Validate();
		roleService= new RoleServices();
	}
	
	public static IRoleServices getRoleService() {
		return roleService;
	}

	public static void setRoleService(IRoleServices roleService) {
		RoleUserInterface.roleService = roleService;
	}

	public static Validate getValidateEmp() {
		return validateEmp;
	}

	public static void setValidateEmp(Validate validateEmp) {
		RoleUserInterface.validateEmp = validateEmp;
	}

	public static void addRole(){		
		roleService.addRole(input("add"));		
	}
	
	public static Role input(String str){
		Role role = new Role();
		Scanner scan = new Scanner(System.in);		
		String roleName=null,roleDesc=null;
		
		if(str.equals("modify"))
		{
			System.out.println("Enter Role Id");
			role.setRoleId(scan.nextInt());
		}
		
		do
		{
			System.out.println("Enter Role name");
			roleName=scan.next();
			role.setRoleName(roleName);
		}while(validateEmp.checkEmpName(roleName)==false);
	
		do
		{
			System.out.println("Enter Role Description");
			roleDesc=scan.next();
			role.setRoleDesc(roleDesc);
		}while(validateEmp.checkDescription(roleDesc)==false);
		
		return role;
	}
	
	public static void modifyRole(){		
		//calling the addEmployee service of Employee
		System.out.println(roleService.modifyRole(input("modify")));	
	}
	public static void removeRole(){
		Scanner scan = new Scanner(System.in);
		int roleId;
		System.out.println("Enter Role Id");
		roleId=scan.nextInt();	
		roleService.removeRole(roleId);
	}
	public static void getAllRole(){
		ArrayList<Role> roleList=roleService.listAllRole();
		if(roleList!=null){
			for(Role r : roleList){
				System.out.println(r);
			}
		}
	}

	public static void searchRole()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Role Id : ");
		int roleId=scan.nextInt();
		Role role = roleService.searchRole(roleId);
		if(role!=null){
			System.out.println("==============Role Found!============\n"
					+role);
		}
		else
			System.out.println("Sorry Boss! Something went"
					+ "wrong Role Id does not Exists");
	}
}
