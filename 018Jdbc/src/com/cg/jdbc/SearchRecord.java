package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.connection.MyConnection;
public class SearchRecord {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps =null;
		ResultSet rs = null;
String searchQuery
="select * from cg.employee where empId=?";		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter empid to be searched");
		int empId=scan.nextInt();
	try {
			con=MyConnection.getConnection();
			ps=con.prepareStatement(searchQuery);
			ps.setInt(1, empId);			
//updating the record
			rs= ps.executeQuery();
			if(rs.next()){			
				System.out.println("=========Employee Found========");
				System.out.println(rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+rs.getDouble(3));
			}
			else
				System.out.println("Record not found");
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
