package com.cg.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.connection.MyConnection;
import com.cg.employee.domain.Employee;
import com.cg.util.DateUtil;

public class EmployeeDao implements IEmployeeDao
{

	@Override
	public void addEmployee(Employee e) 
	{
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
		int eno = 0;
		try {
		//step 1: obtain connection
			con=MyConnection.getConnection();
			System.out.println("Connection Obtained"+con);
		//step 2: obatin stmt
			stmt= con.createStatement();
			rs = stmt.executeQuery("SELECT SQ_EMP.NEXTVAL FROM dual");

			if ( rs!=null && rs.next() ) {
			 eno = rs.getInt(1);
			System.out.println(eno);
			rs.close();
			}
		//step 2: obatin ps
			ps= con.prepareStatement(sql);
		//step 3: set the value to ps
			ps.setInt(1, eno);
			ps.setString(2, e.getEmpName());//ename
			ps.setString(3, e.getKinId());//kinid
			ps.setString(4, e.getEmailId());//email
			ps.setString(5, e.getPhoneNo());//Phone no
			//converting utilDate to SqlDate
			java.sql.Date sqlDob=DateUtil.convertUtiltoSql(e.getDob());
			ps.setDate(6, sqlDob);//Dob
			java.sql.Date sqlDoj=DateUtil.convertUtiltoSql(e.getDoj());
			ps.setDate(7, sqlDoj);//Doj
			ps.setString(8, e.getAddress());//address
			ps.setInt(9, e.getDeptId());//deptId
			ps.setInt(10, e.getProjectId());//projectId
			ps.setInt(11, e.getRoleId());//roleId
		
			//step 4: now executing the ps
			int noOfRecords=ps.executeUpdate();
			//getting the data from the rs
			if(noOfRecords==1){
				System.out.println("Employee Inserted successfully--->");					
			}else{
				System.out.println("Sorry Boss! Employee record"
						+ " not inserted");
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					MyConnection.clossConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
		
	}

	@Override
	public void removeEmployee(int empNo)
	{
		Connection con=null;
		PreparedStatement ps=null;
		String sql="delete from employee where empId=?";
		try {
			//obtain connection
			con=MyConnection.getConnection();
			//obtain PreparedStatement obj
			ps=con.prepareStatement(sql);
			//set the dynamic values of PS
			ps.setInt(1, empNo);
			//executeUpdate the ps
			int noOfRecords=ps.executeUpdate();
			//check weather record deleted or not
			if(noOfRecords==1){
				System.out.println("*****Employee Deleted successfully--->");
				
			}else{
				System.out.println("Sorry Boss! Employee record"
						+ " not deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					MyConnection.clossConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
		
		
	}

	@Override
	public Employee modifyEmployee(Employee e) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="update employee set empId=?,empName=?,emailId=?,phoneNo=?,dob=?,doj=?,address=?,deptId=?,projectId=?,roleId=? where empId=?";
		try {
			//obtain connection
				con=MyConnection.getConnection();
			//obtain PreparedStatement obj
				ps=con.prepareStatement(sql);
			//set the dynamic values of PS place holserd
				ps.setInt(1, e.getEmpId());//empId
				ps.setString(2, e.getEmpName());//empName
				//ps.setString(3, e.getKinId());//kinId
				ps.setString(3, e.getEmailId());//emailId
				ps.setString(4, e.getPhoneNo());//phoneNo
				java.sql.Date sqlDob=DateUtil.convertUtiltoSql(e.getDob());
				ps.setDate(5, sqlDob);//Dob
				java.sql.Date sqlDoj=DateUtil.convertUtiltoSql(e.getDoj());
				ps.setDate(6, sqlDoj);//Doj
				ps.setString(7, e.getAddress());//address
				ps.setInt(8, e.getDeptId());//deptId
				ps.setInt(9, e.getProjectId());//projectId
				ps.setInt(10, e.getRoleId());//roleId
				ps.setInt(11, e.getEmpId());//empId


			//executeUpdate the ps
				int noOfRecords=ps.executeUpdate();
				//check weather record deleted or not
				if(noOfRecords==1){
					System.out.println("Employee Updated successfully--->");
					
				}else{
					System.out.println("Sorry Boss! Employee record"
							+ " not Updated");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}finally{
				try {
					if(ps!=null)
						ps.close();
					if(con!=null)
						MyConnection.clossConnection();
				} catch (Exception e2) {
					e2.printStackTrace();
				}			
			}
		return e;
	}
	
	@Override
	public void modifyEmployeeByProjectId(int projectId) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="update employee set projectId=null where projectId=?";
		try {
			//obtain connection
				con=MyConnection.getConnection();
			//obtain PreparedStatement obj
				ps=con.prepareStatement(sql);
			//set the dynamic values of PS place holserd
				ps.setInt(1, projectId);//projectId
			//executeUpdate the ps
				int noOfRecords=ps.executeUpdate();
				//check weather record deleted or not
				if(noOfRecords==1){
					//System.out.println("Employee Updated successfully--->");
					
				}else{
					/*System.out.println("Sorry Boss! Employee record"
							+ " not Updated");*/
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}finally{
				try {
					if(ps!=null)
						ps.close();
					if(con!=null)
						MyConnection.clossConnection();
				} catch (Exception e2) {
					e2.printStackTrace();
				}			
			}
		//return e;
	}

	@Override
	public Employee searchEmployee(int empId) 
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Employee e1=null;
		try {
			String sql="select * from employee where empId=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);//pre-compiled sql
			ps.setInt(1, empId);//setting the value at runtime
			//now executing the ps
			rs=ps.executeQuery();
			//getting the data from the rs
			if(rs.next()){
				e1= new Employee();
				System.out.println("Employee Found--->");
				
				e1.setEmpId(rs.getInt(1));
				e1.setEmpName(rs.getString(2));
				e1.setKinId(rs.getString(3));
				e1.setEmailId(rs.getString(4));
				e1.setPhoneNo(rs.getString(5));
				e1.setDob(rs.getDate(6));
				e1.setDoj(rs.getDate(7));
				e1.setAddress(rs.getString(8));
				e1.setDeptId(rs.getInt(9));
				e1.setProjectId(rs.getInt(10));
				e1.setRoleId(rs.getInt(11));
			}else{
				System.out.println("Sorry Boss! Employee record for "
						+empId+ " does not Exists");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
				MyConnection.clossConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}//end of finally
		return e1;
	}

	@Override
	public ArrayList<Employee> listAllEmployee() 
	{
		ArrayList<Employee> empList=null;
		Employee e1 = null;
		String sql="select * from employee";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
		//step 1 : get connection
			con=MyConnection.getConnection();
		//step 2: obtain statement obj
			stmt= con.createStatement();
		//step 3: execute sql
			rs=stmt.executeQuery(sql);		
		//step 4: traverse ResultSet
			if(rs!=null){
				empList= new ArrayList<Employee>();
				while(rs.next())
				{
					e1 = new Employee();
				
					e1.setEmpId(rs.getInt(1));
					e1.setEmpName(rs.getString(2));
					e1.setKinId(rs.getString(3));
					e1.setEmailId(rs.getString(4));
					e1.setPhoneNo(rs.getString(5));
					e1.setDob(rs.getDate(6));
					e1.setDoj(rs.getDate(7));
					e1.setAddress(rs.getString(8));
					e1.setDeptId(rs.getInt(9));
					e1.setProjectId(rs.getInt(10));
					e1.setRoleId(rs.getInt(11));
					/*System.out.println(rs.getInt(1)+"\t\t|"
							+rs.getString(2)+"\t\t|"
							+rs.getString(3)+"\t\t|"
							+rs.getString(4)+"\t\t|"
							+rs.getString(5));*/
					empList.add(e1);
				}	
				
			}//END OF IF
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("In main");
		//EmployeeDao dao = new EmployeeDao();
		//dao.removeEmployee(1);
		//Employee e=input();
		//System.out.println(dao.modifyEmployee(e));
		//dao.addEmployee(e);
		/*ArrayList<Employee> list = dao.listAllEmployee();
		for(Employee emp : list)
		{
			System.out.println(emp);
		}*/
		
		//System.out.println(dao.searchEmployee(3));
	}
	
	public static Employee input(){
		
		Employee e1 = new Employee();
		e1.setEmpId(111);
		e1.setEmpName("Sam");
		e1.setKinId(e1.getKinId());
		e1.setEmailId("sam@gmail.com");
		e1.setPhoneNo("+918989898989");
		java.util.Date utilDob=
				DateUtil.convertStringToUtilDate("1999/11/11");		
		//setting the sqlDate into DB
		e1.setDob(utilDob);
		java.util.Date utilDoj=
				DateUtil.convertStringToUtilDate("2015/12/11");		
		//setting the sqlDate into DB
		e1.setDoj(utilDoj);
		e1.setAddress("Mumbai");
		e1.setDeptId(10);
		e1.setProjectId(1);
		e1.setRoleId(1001);
		
		return e1;
	}


}
