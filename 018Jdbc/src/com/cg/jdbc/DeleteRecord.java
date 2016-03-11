package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.connection.MyConnection;
public class DeleteRecord {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps =null;
String deleteQuery
="delete from cg.employee where empId=?";		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter empid to be deleted");
		int empId=scan.nextInt();
		try {
			con=MyConnection.getConnection();
			ps=con.prepareStatement(deleteQuery);
			ps.setInt(1, empId);			
//updating the record
			int no_of_rec= ps.executeUpdate();
			if(no_of_rec==0)
				System.out.println("Employee Record not found");
			else
				System.out.println(no_of_rec +" Employee Deleted!!");
		} catch (Exception e) {e.printStackTrace();// TODO: handle exception
		}finally{//close the resource
			try {
				if(ps!=null)//check weather resource is null/not
					ps.close();
				if(con!=null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}//end of inner try
		}//end of finally
	}

}
