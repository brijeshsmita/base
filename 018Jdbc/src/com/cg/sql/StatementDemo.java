package com.cg.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.connection.MyConnection;

public class StatementDemo {
	
	public static void showAllEmployee(){
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
//step 1 : getConnection
			con=MyConnection.getCon();
//step 2 : create statement object to execute SQL cmd
			st=con.createStatement();
			String sql="select * from myemp";
//step 3 : create ResultSet object to store result from DB
			rs=st.executeQuery(sql);
//step 4 : get the data from the ResultSet
			System.out.println("|===============================================================================|");
			System.out.println("|			Employee Records					|");
			System.out.println("|===============================================================================|");
			System.out.println("|EmpNo\t|\tEName\t|\tGrade\t|\tDate Of Birth"
					+ "\t\t|DeptNo\t|");
			System.out.println("|===============================================================================|");
			while(rs.next()){
				System.out.println("|"+rs.getInt(1)
						+"\t|\t"+rs.getString(2)
						+"\t|\t"+rs.getString(3)
						+"\t|\t"+rs.getString(4)
						+"\t|"+rs.getString(5)
						+"\t|");
			}
			System.out.println("|===============================================================================|");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(st!=null)
					st.close();
				if(con!=null)
					MyConnection.closeCon();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
	}
}
