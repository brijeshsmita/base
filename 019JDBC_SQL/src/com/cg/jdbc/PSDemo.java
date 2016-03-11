package com.cg.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.cg.connection.MyConnection;
import com.cg.util.DateUtil;
public class PSDemo {
	//C-create record
		public static void insertEmployee(){
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try {
				String sql="insert into myemp values(?,?,?,?,?)";
		//step 1 : get connection
				con=MyConnection.getConnection();
		//step 2: obtain PreparedStatement obj by passing sql
				ps=con.prepareStatement(sql);//pre-compiled sql
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter Employee Number(xxxx)only numbers:");
		//step 3: setting the value at runtime
				ps.setInt(1, scan.nextInt());
				ps.setString(2, "Meera");//ename
				ps.setString(3, "T2");//grade
				//converting String in utilDate
				java.util.Date utilDob=
						DateUtil.convertStringToUtilDate("1999/11/11");
				//converting utilDate to SqlDate
				java.sql.Date sqlDob=DateUtil.convertUtiltoSql(utilDob);
				//setting the sqlDate into DB
				ps.setDate(4,sqlDob);//dob
				ps.setInt(5, 10);//deptno
		//step 4: now executing the ps
				int noOfRecords=ps.executeUpdate();
				//getting the data from the rs
				if(noOfRecords==1){
					System.out.println("Employee Inserted successfully--->");					
				}else{
					System.out.println("Sorry Boss! Employee record"
							+ " not inserted");
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
		}//end of insertEmployee()
	//R-Retrieve(fetching the record from database
	public static void findEmployeeById(int empNo){
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
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
				System.out.println("|"+rs.getInt(1)
						+"\t|\t"+rs.getString(2)
						+"\t|\t"+rs.getString(3)
						+"\t|\t"+rs.getString(4)
						+"\t|"+rs.getString(5)
						+"\t|");
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
	}//end of findEmployeeById()
	//U-Update record
	public static void updateEmpGrade(String grade,int empNo){
		Connection con=null;
		PreparedStatement ps=null;
		String sql="update myemp set grade=? where empno=?";
		try {
		//obtain connection
			con=MyConnection.getConnection();
		//obtain PreparedStatement obj
			ps=con.prepareStatement(sql);
		//set the dynamic values of PS place holserd
			ps.setString(1, grade);
			ps.setInt(2, empNo);
		//executeUpdate the ps
			int noOfRecords=ps.executeUpdate();
			//check weather record deleted or not
			if(noOfRecords==1){
				System.out.println("Employee Updated successfully--->");
				
			}else{
				System.out.println("Sorry Boss! Employee record"
						+ " not Updated");
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
	//D-Delete record
	public static void deleteEmployee(int empNo){
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
	
	
}//end of class
