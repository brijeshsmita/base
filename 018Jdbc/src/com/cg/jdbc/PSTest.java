
package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.cg.connection.MyConnection;

public class PSTest {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps =null;
String insertQuery="insert into cg.employee values(?,?,?)";
		int empId;
		String empName;
		double empSal;
		Scanner scan= new Scanner(System.in);
		try {
//get connection
			con=MyConnection.getConnection();
//creating PreparedStatement obj for precompiled query
			ps= con.prepareStatement(insertQuery);
			System.out.println("enter empid: ");
			empId=scan.nextInt();
//setting the dynamic value to ps
			ps.setInt(1, empId);
			ps.setString(2, "Smita");
			ps.setDouble(3, 7687.99);
//inserting the record in the db with the help of executeUpdate()			
			int no_of_rec= ps.executeUpdate();
			System.out.println(no_of_rec 
					+ " Employee record inserted!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
