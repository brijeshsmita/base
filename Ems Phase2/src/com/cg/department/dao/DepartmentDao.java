package com.cg.department.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.connection.MyConnection;
import com.cg.department.domain.Department;
import com.cg.exception.EmsException;

public class DepartmentDao implements IDepartmentDao 
{

	@Override
	public void addDepartment(Department d){
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="insert into department values(?,?,?)";
		int rno = 0;
		try {
			con=MyConnection.getConnection();
			System.out.println("Connection Obtained"+con);
			stmt= con.createStatement();
			rs = stmt.executeQuery("SELECT SQ_EMP.NEXTVAL FROM dual");
			if ( rs!=null && rs.next() ) {
			 rno = rs.getInt(1);
			System.out.println(rno);
			rs.close();
			}
			ps= con.prepareStatement(sql);
			ps.setInt(1, rno);
			ps.setString(2, d.getDeptName());
			ps.setString(3, d.getDeptDesc());
			int noOfRecords=ps.executeUpdate();
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
					MyConnection.clossConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}	
	}

	@Override
	public void removeDepartment(int deptId) {
		Connection con=null;
		PreparedStatement ps=null;
		String sql="delete from department where deptId=?";
		try {
			//obtain connection
			con=MyConnection.getConnection();
			//obtain PreparedStatement obj
			ps=con.prepareStatement(sql);
			//set the dynamic values of PS
			ps.setInt(1, deptId);
			//executeUpdate the ps
			int noOfRecords=ps.executeUpdate();
			//check weather record deleted or not
			if(noOfRecords==1){
				System.out.println("*****Department Deleted successfully--->");
				
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
					MyConnection.clossConnection();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}

	}

	@Override
	public Department modifyDepartment(Department d){
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="update department set deptName=?,deptDesc=? where deptId=?";
		try {
			//obtain connection
				con=MyConnection.getConnection();
			//obtain PreparedStatement obj
				ps=con.prepareStatement(sql);
			//set the dynamic values of PS place holserd
				ps.setString(1, d.getDeptName());//ename
				ps.setString(2, d.getDeptDesc());//grade
				ps.setDouble(3, d.getDeptId());
			
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
						MyConnection.clossConnection();
				} catch (Exception e2) {
					e2.printStackTrace();
				}			
			}
		return d;
		
		
	}

	@Override
	public Department searchDepartment(int deptId){
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Department d1=null;
		try {
			String sql="select * from department where deptId=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);//pre-compiled sql
			ps.setInt(1, deptId);//setting the value at runtime
			//now executing the ps
			rs=ps.executeQuery();
			//getting the data from the rs
			if(rs.next()){
				d1= new Department();
				System.out.println("Department Found--->");
				
				d1.setDeptId(rs.getInt(1));
				d1.setDeptName(rs.getString(2));
				d1.setDeptDesc(rs.getString(3));
			}else{
				System.out.println("Sorry Boss! Department record for "
						+deptId+ " does not Exists");
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
		return d1;
		
	}

	@Override
	public ArrayList<Department> listAllDepartment() {
		ArrayList<Department> deptList= new ArrayList<Department>();
		Department d1 = null;
		String sql="select * from department";
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
				d1.setDeptId(rs.getInt(1));
				d1.setDeptName(rs.getString(2));
				d1.setDeptDesc(rs.getString(3));
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
	public static void main(String[] args) throws EmsException {
		DepartmentDao dao = new DepartmentDao();
		/*Department d=input();
		dao.addDepartment(d);
		d=input();
	   System.out.println(dao.modifyDepartment(d));
	  System.out.println(dao.searchDepartment(d.getDeptId()));
		dao.removeDepartment(d.getDeptId());*/
		ArrayList<Department> list = dao.listAllDepartment();
		for(Department dept : list){
			System.out.println(dept);
		}
	}
	public static Department input(){
		
		Department d = new Department();
		d.setDeptId(1111);
		d.setDeptName("Java");
		d.setDeptDesc("Apps1");
		return d;
	}

	@Override
	public void showAllDeptId() 
	{

		ArrayList<Department> empList= new ArrayList<>();
		Department e1 = null;
		String sql="select deptId from department";
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
			
			while(rs.next())
			{
				e1 = new Department();
			
				e1.setDeptId(rs.getInt(1));
				
				empList.add(e1);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(empList!=null){
			System.out.println("===========Department Id============");
			for(Department dept : empList){
				System.out.println(dept.getDeptId());
			}
		}
	
	}
}



