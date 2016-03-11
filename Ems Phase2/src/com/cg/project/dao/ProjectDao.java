package com.cg.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.cg.connection.MyConnection;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.services.EmployeeServices;
import com.cg.project.domain.Project;
import com.cg.employee.dao.IEmployeeDao;


public class ProjectDao implements IProjectDao 
{
	EmployeeDao empdao=new EmployeeDao();
	@Override
	public void addProject(Project p) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="insert into project values(?,?,?,?)";
		int pno = 0;
		try {
		//step 1: obtain connection
			con=MyConnection.getConnection();
			System.out.println("Connection Obtained"+con);
		//step 2: obatin stmt
			stmt= con.createStatement();
			rs = stmt.executeQuery("SELECT SQ_PROJECT.NEXTVAL FROM dual");

			if ( rs!=null && rs.next() ) {
			 pno = rs.getInt(1);
			System.out.println(pno);
			rs.close();
			}
		//step 2: obatin ps
			ps= con.prepareStatement(sql);
		//step 3: set the value to ps
			ps.setInt(1, pno);
			ps.setString(2, p.getProjectName());//ename
			ps.setString(3, p.getProjectDescription());//grade
			ps.setInt(4, p.getDeptId());//deptno
		
			//step 4: now executing the ps
			int noOfRecords=ps.executeUpdate();
			//getting the data from the rs
			if(noOfRecords==1){
				System.out.println("Project Inserted successfully--->");					
			}else{
				System.out.println("Sorry Boss! Project record"
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
	public void removeProject(int projectId) {
		Connection con=null;
		PreparedStatement ps=null;
		
		empdao.modifyEmployeeByProjectId(projectId);
		String sql="delete from project where projectId=?";
		try {
			//obtain connection
			con=MyConnection.getConnection();
			//obtain PreparedStatement obj
			ps=con.prepareStatement(sql);
			//set the dynamic values of PS
			ps.setInt(1, projectId);
			//executeUpdate the ps
			int noOfRecords=ps.executeUpdate();
			//check weather record deleted or not
			if(noOfRecords==1){
				System.out.println("*****Project Deleted successfully--->");
				
			}else{
				System.out.println("Sorry Boss! Project record"
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
	public Project modifyProject(Project p) {
		Connection con=null;
		Statement stmt=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="update project set projectName=? where projectId=?";
		try {
			//obtain connection
				con=MyConnection.getConnection();
			//obtain PreparedStatement obj
				ps=con.prepareStatement(sql);
			//set the dynamic values of PS place holserd
				ps.setString(1, p.getProjectName());//grade
				ps.setInt(2, p.getProjectId());//ename
		
				int noOfRecords=ps.executeUpdate();
				//check weather record deleted or not
				if(noOfRecords==1){
					System.out.println("Project Updated successfully--->");
					
				}else{
					System.out.println("Sorry Boss! Project record"
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
		return p;
	}

	@Override
	public Project searchProject(int projectId) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Project e1= null;
		try {
			String sql="select * from project where projectId=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);//pre-compiled sql
			ps.setInt(1, projectId);//setting the value at runtime
			//now executing the ps
			rs=ps.executeQuery();
			//getting the data from the rs
			if(rs.next()){
				e1=new Project();
				System.out.println("Project Found--->");
				
				e1.setProjectId(rs.getInt(1));
				e1.setProjectName(rs.getString(2));
				e1.setProjectDescription(rs.getString(3));
				

			}else{
				System.out.println("Sorry Boss! Project record for "
						+projectId+ " does not Exists");
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
	public ArrayList<Project> listAllProject() {
		ArrayList<Project> empList= new ArrayList<Project>();
		Project p = null;
		String sql="select * from project";
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
				p = new Project();
				p.setProjectId(rs.getInt(1));
				p.setProjectName(rs.getString(2));
				p.setProjectDescription(rs.getString(3));
				p.setDeptId(rs.getInt(4));
				/*System.out.println(rs.getInt(1)+"\t\t|"
						+rs.getString(2)+"\t\t|"
						+rs.getString(3)+"\t\t|"
						+rs.getString(4)+"\t\t|"
						+rs.getString(5));*/
				empList.add(p);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(empList!=null){
			System.out.println("=======Project Records======");
		}
		return empList;
	}
	
	public static void main(String[] args) {
		ProjectDao dao = new ProjectDao();
		Project p=input();
		//dao.addProject(p);
		
		//System.out.println(dao.modifyProject(p));
		System.out.println(dao.searchProject(100));
		//dao.removeProject(p.getProjectId());
		/*ArrayList<Project> list = dao.listAllProject();
		for(Project p1 : list)
		{
			System.out.println(p1);000.3.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			llkokk;lk;lml;m,lklkmmklklmklm,.m,m,,,,,,,,,,,,
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			gbn
			i
			i
			y
			yya
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			+
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}*/
	}
	public static Project input(){
		
		Project p = new Project();
		
		p.setProjectId(40);
		p.setProjectName("Prj1 desc");
		p.setDeptId(20);
		return p;
	}

	@Override
	public void showAllProjectId() 
	{
		ArrayList<Project> projectList= new ArrayList<>();
		Project e1 = null;
		String sql="select projectId from project";
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
				e1 = new Project();
			
				e1.setDeptId(rs.getInt(1));
				
				projectList.add(e1);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(projectList!=null){
			System.out.println("=======Department Id======");
			for(Project dept : projectList){
				System.out.println(dept.getDeptId());
			}
		}
		
	}

}
