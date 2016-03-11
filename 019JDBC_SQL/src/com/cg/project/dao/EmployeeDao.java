package com.cg.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.connection.MyConnection;
import com.cg.project.domain.Employee;
import com.cg.project.service.DepartmentService;
import com.cg.project.service.IDepartmentService;
import com.cg.util.DateUtil;

public class EmployeeDao implements IEmployeeDao {
	
	@Override
	public void addEmployee(Employee e) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="insert into myemp values(?,?,?,?,?)";
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
			ps.setString(2, e.getEname());//ename
			ps.setString(3, e.getGrade());//grade
		//converting utilDate to SqlDate
			java.sql.Date sqlDob=DateUtil.convertUtiltoSql(e.getDob());
		//setting the sqlDate into DB
			ps.setDate(4,sqlDob);//dob
			ps.setInt(5, e.getDeptNo());//deptno
		
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
					MyConnection.closeConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}

	}

	@Override
	public void removeEmployee(int empNo) {
		Connection con=null;
		PreparedStatement ps=null;
		String sql="delete from myemp where empno=?";
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
					MyConnection.closeConnection();
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
		String sql="update myemp set grade=?,ename=?,dob=?,deptno=? where empno=?";
		try {
			//obtain connection
				con=MyConnection.getConnection();
			//obtain PreparedStatement obj
				ps=con.prepareStatement(sql);
			//set the dynamic values of PS place holserd
				ps.setString(1, e.getGrade());//grade
				ps.setString(2, e.getEname());//ename
			//converting utilDate to SqlDate
				java.sql.Date sqlDob=DateUtil.convertUtiltoSql(e.getDob());
			//setting the sqlDate into DB
				ps.setDate(3,sqlDob);//dob
				ps.setInt(4, e.getDeptNo());//deptno
				ps.setInt(5, e.getEmpNo());//empno
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
						MyConnection.closeConnection();
				} catch (Exception e2) {
					e2.printStackTrace();
				}			
			}
		return e;
	}

	@Override
	public Employee searchEmployee(int empNo) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Employee e1= new Employee();
		try {
			String sql="select * from myemp where empno=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);//pre-compiled sql
			ps.setInt(1, empNo);//setting the value at runtime
			//now executing the ps
			rs=ps.executeQuery();
			//getting the data from the rs
			if(rs.next()){
				System.out.println("Employee Found--->");
				
				e1.setEmpNo(rs.getInt(1));
				e1.setEname(rs.getString(2));
				e1.setGrade(rs.getString(3));
				e1.setDob(rs.getDate(4));
				e1.setDeptNo(rs.getInt(5));
			}else{
				System.out.println("Sorry Boss! Employee record for "
						+empNo+ " does not Exists");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
				MyConnection.closeConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}//end of finally
		return e1;
	}

	@Override
	public ArrayList<Employee> listAllEmployee() {
		ArrayList<Employee> empList= new ArrayList<Employee>();
		Employee e1 = null;
		String sql="select * from myemp";
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
			while(rs.next()){
				e1 = new Employee();
				e1.setEmpNo(rs.getInt(1));
				e1.setEname(rs.getString(2));
				e1.setGrade(rs.getString(3));
				e1.setDob(rs.getDate(4));
				e1.setDeptNo(rs.getInt(5));
				/*System.out.println(rs.getInt(1)+"\t\t|"
						+rs.getString(2)+"\t\t|"
						+rs.getString(3)+"\t\t|"
						+rs.getString(4)+"\t\t|"
						+rs.getString(5));*/
				empList.add(e1);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(empList!=null){
			System.out.println("=======Employee Records======");
		}
		return empList;
	}
//for testing
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		Employee e=input();
		dao.addEmployee(e);
		e=input();
		System.out.println(dao.modifyEmployee(e));
		System.out.println(dao.searchEmployee(e.getEmpNo()));
		dao.removeEmployee(e.getEmpNo());
		ArrayList<Employee> list = dao.listAllEmployee();
		for(Employee emp : list){
			System.out.println(emp);
		}
	}
	public static Employee input(){
		
		Employee e = new Employee();
		e.setEmpNo(2222);
		e.setEname("Ria");e.setGrade("T3");
		java.util.Date utilDob=
				DateUtil.convertStringToUtilDate("1999/11/11");		
		//setting the sqlDate into DB
		e.setDob(utilDob);
		e.setDeptNo(10);
		return e;
	}
}
