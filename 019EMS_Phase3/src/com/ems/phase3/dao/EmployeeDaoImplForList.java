package com.ems.phase3.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.ems.phase3.model.Employee;

public class EmployeeDaoImplForList implements IEmployeeDao{
	static ArrayList<Employee> empList;
	PreparedStatement ps=null;
	Statement stmt=null;
	ResultSet rs=null;
	Connection con;
	/*//init block
	{
			con=MyConnection.getConnection();
	}
	*/
	static{
		empList=new ArrayList<Employee>();
	}
	@Override
	public void addEmployee(Employee e,Connection con) {
		String insertQuery ="insert into ems.employee "
				+ "(employeeName,kinid,emailId,phoneNo,"
				+ "dateOfBirth,dateOfJoining,address,departmentId"
				+ ",projectId,roleId) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(insertQuery);
			ps.setString(1, e.getEmployeeName());
			ps.setString(2, e.getKinId());
			ps.setString(3,e.getEmailId());
			ps.setString(4, e.getPhoneNo());
			ps.setDate(5, e.getDateOfBirth());
			ps.setDate(6, e.getDateOfJoining());
			ps.setString(7,e.getAddress());
			ps.setString(8,e.getDepartmentId());
			ps.setString(9,e.getProjectId());
			ps.setString(10,e.getRoleId());
			int no_rec=ps.executeUpdate();
			if(no_rec==1)
				System.out.println("No of records inserted :"+no_rec);
			else
				System.out.println("Record not inserted");
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
	
	
	public ArrayList<Employee> listAllEmployee(Connection con) {
		String selectQuery="select * from ems.employee";
		ArrayList<Employee> empList= new ArrayList<Employee>();
		
		try 
		{
			stmt= (Statement) con.createStatement();
			rs=stmt.executeQuery(selectQuery);
			
			while(rs.next())
			{Employee e1= new Employee(); 
				e1.setEmployeeId(rs.getInt(1));
				e1.setEmployeeName(rs.getString(2));
				e1.setKinId(rs.getString(3));
				e1.setEmailId(rs.getString(4));
				e1.setPhoneNo(rs.getString(5));
				e1.setDateOfBirth(rs.getDate(6));
				e1.setDateOfJoining(rs.getDate(7));
				e1.setAddress(rs.getString(8));
				e1.setDepartmentId(rs.getString(9));
				e1.setProjectId(rs.getString(10));
				e1.setRoleId(rs.getString(11));
				empList.add(e1);
				System.out.println(e1);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
		
	}
	


	@Override
	public Employee searchByEmailId(String emailId,Connection con) {
		int employeeId;
		String employeeName;
		String emailI;
		String address;
		String phoneNo;
		Date dateOfJoining;
	 	Date dateOfBirth;
	 	String projectId;
	 	String roleId;
	 	String departmentId;
		 Employee e1=new Employee();
			String selectquery="select * from ems.employee where emailId=?";
			try {
				ps=con.prepareStatement(selectquery);
				ps.setString(1, emailId);
				rs=ps.executeQuery();
				
				
				if(rs.next()){
					employeeId=rs.getInt(1);
					employeeName=rs.getString(2);
					String employeeKin = rs.getString(3);
					emailId=rs.getString(4);
					phoneNo=rs.getString(5);
					dateOfBirth=rs.getDate(6);
					dateOfJoining=rs.getDate(7);
					address=rs.getString(8);
					departmentId=rs.getString(9);
					projectId=rs.getString(10);
					roleId=rs.getString(11);
					
				
					
					e1.setEmployeeId(employeeId);
					e1.setEmployeeName(employeeName);
					e1.setEmailId(emailId);
					e1.setKinId(employeeKin);
					e1.setAddress(address);
					e1.setPhoneNo(phoneNo);
					e1.setDateOfJoining(dateOfJoining);
					e1.setDateOfBirth(dateOfBirth);
					e1.setProjectId(projectId);
					e1.setRoleId(roleId);
					e1.setDepartmentId(departmentId);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				
				try {
					if(rs!=null)
						rs.close();
					if(ps!=null)
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		
			   }
			return e1;
	}

	@Override
	public Employee searchByName(String name,Connection con) {
		int employeeId;
		String employeeName;
		String emailId;
		String address;
		String phoneNo;
		Date dateOfJoining;
	 	Date dateOfBirth;
	 	String projectId;
	 	String roleId;
	 	String departmentId;
		 Employee e1=new Employee();
			String selectquery="select * from ems.employee where empName=?";
			try {
				ps=con.prepareStatement(selectquery);
				ps.setString(1, name);
				rs=ps.executeQuery();
				
				
				if(rs.next()){
					employeeId=rs.getInt(1);
					employeeName=rs.getString(2);
					String employeeKin = rs.getString(3);
					emailId=rs.getString(4);
					phoneNo=rs.getString(5);
					dateOfBirth=rs.getDate(6);
					dateOfJoining=rs.getDate(7);
					address=rs.getString(8);
					departmentId=rs.getString(9);
					projectId=rs.getString(10);
					roleId=rs.getString(11);
					
				
					
					e1.setEmployeeId(employeeId);
					e1.setEmployeeName(employeeName);
					e1.setEmailId(emailId);
					e1.setKinId(employeeKin);
					e1.setAddress(address);
					e1.setPhoneNo(phoneNo);
					e1.setDateOfJoining(dateOfJoining);
					e1.setDateOfBirth(dateOfBirth);
					e1.setProjectId(projectId);
					e1.setRoleId(roleId);
					e1.setDepartmentId(departmentId);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				
				try {
					if(rs!=null)
						rs.close();
					if(ps!=null)
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		
			   }
		
			return e1;
			
	}
	@Override
	public void removeEmployee(String kinId,Connection con) {
		System.out.println(kinId);
		String deleteQuery="delete from ems.employee  where kinId=?";
		try {
			ps=con.prepareStatement(deleteQuery);
			ps.setString(1, kinId);
			int no_of_rec=ps.executeUpdate();
			if(no_of_rec==0)
				System.out.println("Employee not found");
			else
				System.out.println("Employee deleted");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(ps!=null)
					ps.close();
								
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
		
		
		
		
	}

	@Override
	public void modifyEmployee(Employee e,Connection con) {
		//String emailId="";
		Scanner scan= new Scanner(System.in);
		//System.out.println("enter the emailId");
		//emailId=scan.next();
		//System.out.println("enter the empId");
		//int eId = scan.nextInt();
		/*
		 * employeeId int AUTO_INCREMENT PRIMARY KEY,
	employeeName varchar(50)NOT NULL,
	kinId varchar(20) UNIQUE KEY NOT NULL,
	emailId varchar(20) UNIQUE KEY NOT NULL,
	phoneNo VARCHAR(12) not null ,
	dateOfBirth date not null,
	dateOfJoining date not null,
	address varchar(200) not null,
	departmentId int,
	projectId int,
	roleId int,
		 */
		String updateQuery="update ems.employee set emailId=?,"
				+ "employeeName=?,dateOfBirth=?,dateOfJoining=?,address=?"
				+ ",departmentId=?,projectId=?,roleId=?,phoneNo=? where kinId=?";
		
		try {
			ps=con.prepareStatement(updateQuery);
			ps.setString(1, e.getEmailId());
			ps.setString(2, e.getEmployeeName());
			ps.setDate(3, e.getDateOfBirth());
			ps.setDate(4, e.getDateOfJoining());
			ps.setString(5, e.getAddress());
			ps.setString(6, e.getDepartmentId());
			ps.setString(7, e.getProjectId());
			ps.setString(8, e.getRoleId());
			ps.setString(9, e.getPhoneNo());
			ps.setString(10, e.getKinId());
			int no_of_rec=ps.executeUpdate();
			if(no_of_rec==0)
				System.out.println("Employee not updated");
			else
				System.out.println("Employee updated");
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally
		{
			try{
				if(ps!=null)
					ps.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		
	}
		
	}

	@Override
	public Employee searchByKinId(String kinId,Connection con) {
		int employeeId;
		String employeeName;
		String emailId;
		String address;
		String phoneNo;
		Date dateOfJoining;
	 	Date dateOfBirth;
	 	String projectId;
	 	String roleId;
	 	String departmentId;
		 Employee e1=new Employee();
			String selectquery="select * from ems.employee where kinId=?";
			try {
				ps=con.prepareStatement(selectquery);
				ps.setString(1, kinId);
				rs=ps.executeQuery();
				
				
				if(rs.next()){
					employeeId=rs.getInt(1);
					employeeName=rs.getString(2);
					String employeeKin = rs.getString(3);
					emailId=rs.getString(4);
					phoneNo=rs.getString(5);
					dateOfBirth=rs.getDate(6);
					dateOfJoining=rs.getDate(7);
					address=rs.getString(8);
					departmentId=rs.getString(9);
					projectId=rs.getString(10);
					roleId=rs.getString(11);
					
				
					
					e1.setEmployeeId(employeeId);
					e1.setEmployeeName(employeeName);
					e1.setKinId(employeeKin);
					e1.setEmailId(emailId);
					e1.setAddress(address);
					e1.setPhoneNo(phoneNo);
					e1.setDateOfJoining(dateOfJoining);
					e1.setDateOfBirth(dateOfBirth);
					e1.setDepartmentId(departmentId);
					e1.setProjectId(projectId);
					e1.setRoleId(roleId);
					
					System.out.println(e1);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				
				try {
					if(rs!=null)
						rs.close();
					if(ps!=null)
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
		
			   }
			return e1;
	}
	public static void main(String[] args) {
		EmployeeDaoImplForList dao= new EmployeeDaoImplForList();
		Employee emp = dao.searchByKinId("KinID295478", dao.con);
		emp.setEmailId("smita@gmail.com");
		dao.modifyEmployee(emp, dao.con);
	}
}
