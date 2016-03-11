package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.connection.MyConnection;
public class UpdateRecord {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps =null;
String updateQuery
="update cg.employee set empSal=? where empId=?";		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter empid");
		int empId=scan.nextInt();
		System.out.println("Enter salary to be updated");
		double empSal=scan.nextDouble();
		try {
			con=MyConnection.getConnection();
			ps=con.prepareStatement(updateQuery);
			ps.setDouble(1, empSal);
			ps.setInt(2, empId);			
//updating the record
			int no_of_rec= ps.executeUpdate();
			if(no_of_rec==0)
				System.out.println("Record not found");
			else
				System.out.println(no_of_rec +" Employee updated!!");
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
