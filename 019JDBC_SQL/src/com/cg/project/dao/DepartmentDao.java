package com.cg.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.connection.MyConnection;
import com.cg.project.domain.Department;
import com.cg.project.domain.Employee;
import com.cg.util.DateUtil;

public class DepartmentDao implements IDepartmentDao {
	
	@Override
	public void addDepartment(Department department) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="insert into mydept values(?,?,?)";
		int dno = 0;
		try {
		//step 1: obtain connection
			con=MyConnection.getConnection();
			System.out.println("Connection Obtained"+con);
		//step 2: obatin stmt
			stmt= con.createStatement();
			rs = stmt.executeQuery("SELECT SQ_DEPT.NEXTVAL FROM dual");

			if ( rs!=null && rs.next() ) {
			 dno = rs.getInt(1);
			 rs.close();
			}
		//step 2: obatin ps
			ps= con.prepareStatement(sql);
		//step 3: set the value to ps
			ps.setInt(1, dno);
			ps.setString(2, department.getDname());//dname
			ps.setString(3, department.getLoc());//loc
		
			//step 4: now executing the ps
			int noOfRecords=ps.executeUpdate();
			//getting the data from the rs
			if(noOfRecords==1){
				System.out.println("Department Inserted successfully--->");					
			}else{
				System.out.println("Sorry Boss! Department record"
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
	public void removeDepartment(int deptNo) {
		Connection con=null;
		PreparedStatement ps=null;
		String sql="delete from mydept where deptno=?";
		try {
			//obtain connection
			con=MyConnection.getConnection();
			//obtain PreparedStatement obj
			ps=con.prepareStatement(sql);
			//set the dynamic values of PS
			ps.setInt(1, deptNo);
			//executeUpdate the ps
			int noOfRecords=ps.executeUpdate();
			//check weather record deleted or not
			if(noOfRecords==1){
				System.out.println("*****Employee Department successfully--->");
				
			}else{
				System.out.println("Sorry Boss! Department record"
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
	public Department modifyDepartment(Department department) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="update mydept set dname=?,loc=? where deptno=?";
		try {
			//obtain connection
				con=MyConnection.getConnection();
			//obtain PreparedStatement obj
				ps=con.prepareStatement(sql);
			//set the dynamic values of PS place holserd
				ps.setString(1, department.getDname());//dname
				ps.setString(2, department.getLoc());//loc			
				ps.setInt(3, department.getDeptNo());//deptno
			//executeUpdate the ps
				int noOfRecords=ps.executeUpdate();
				//check weather record deleted or not
				if(noOfRecords==1){
					System.out.println("Department Updated successfully--->");
					
				}else{
					System.out.println("Sorry Boss! Department record"
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
		return department;
	}

	@Override
	public Department searchDepartment(int deptNo) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Department d1= new Department();
		try {
			String sql="select * from mydept where deptno=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);//pre-compiled sql
			ps.setInt(1, deptNo);//setting the value at runtime
			//now executing the ps
			rs=ps.executeQuery();
			//getting the data from the rs
			if(rs.next()){
				System.out.println("Department Found--->");
				
				d1.setDeptNo(rs.getInt(1));
				d1.setDname(rs.getString(2));
				d1.setLoc(rs.getString(3));
			}else{
				System.out.println("Sorry Boss! Department record for "
						+deptNo+ " does not Exists");
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
		return d1;
	}

	@Override
	public ArrayList<Department> listAllDepartment() {
		ArrayList<Department> deptList= new ArrayList<Department>();
		Department d1 = null;
		String sql="select * from mydept";
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
				d1 = new Department();
				d1.setDeptNo(rs.getInt(1));
				d1.setDname(rs.getString(2));
				d1.setLoc(rs.getString(3));
				deptList.add(d1);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(deptList!=null){
			System.out.println("=======Department Records======");
		}
		return deptList;
	}
//for testing
	public static void main(String[] args) {
		DepartmentDao dao = new DepartmentDao();
		Department d = new Department();
		d=input(d);
		dao.addDepartment(d);
		d=input(d);
		System.out.println(dao.modifyDepartment(d));
		System.out.println(dao.searchDepartment(d.getDeptNo()));
		dao.removeDepartment(d.getDeptNo());
		ArrayList<Department> list = dao.listAllDepartment();
		for(Department dept : list){
			System.out.println(dept);
		}
	}
	public static Department input(Department d){		
		d.setDname("HR");d.setLoc("Mumbai");
		return d;
	}
}
