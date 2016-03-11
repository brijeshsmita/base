package com.cg.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.cg.connection.MyConnection;

public class CallableTest {
	private static Connection con;
	private static CallableStatement csmt;
	private static ResultSet rs;
	static{
		con= MyConnection.getConnection();
	}
//update salary
	public static void updateSal(int empId){
		String query="{call cg.emp_proc(?,?)}";
		try {
			csmt=con.prepareCall(query);
			csmt.setInt(1, empId);
			//output parameter must be always registered
			csmt.registerOutParameter(2,Types.DOUBLE);
			int no_rec=csmt.executeUpdate();
			if(no_rec==0)
				System.out.println("Record not found");
			else
				System.out.println("Empoyee salary update");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
			if(csmt!=null)//check weather resource is null/not
				csmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}//end of inner try
		}//end of finally
	}
	public static void main(String[] args) {
		updateSal(102);
		searchEmployee(102);
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void searchEmployee(int empId)
	{
		try {
		
			csmt= con.prepareCall("{call proc_getData(?,?,?)}");
			csmt.setInt(1, empId);
			//output parameter must be always registered
			csmt.registerOutParameter(2,Types.DOUBLE);
			csmt.registerOutParameter(3,Types.VARCHAR);
			boolean status=csmt.execute();
			if(!status)
			{
				System.out.println("===============================");
				System.out.println("Employee ID		:-	"+empId);
				System.out.println("Employee Name	:-	"+csmt.getString(2));
				System.out.println("Employee Sal	:-	"+csmt.getDouble(3));
			}
			else{
				System.out.println("Not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
			if(csmt!=null)//check weather resource is null/not
				csmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}//end of inner try
		}//end of finally
	}
}
/*
*/