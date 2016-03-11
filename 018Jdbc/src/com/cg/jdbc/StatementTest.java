package com.cg.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.connection.MyConnection;

public class StatementTest {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt =null;
		ResultSet rs = null;
		String selectQuery="select * from cg.employee";
//get connection
		try {
			con=MyConnection.getConnection();
//create statement obj
			stmt= con.createStatement();
			System.out.println("Statement created "+stmt);
//firing the selectQuery
			rs= stmt.executeQuery(selectQuery);
			System.out.println("==========Employees Records=======");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+rs.getDouble(3));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{//close the resource
			try {
				if(stmt!=null)//check weather resource is null/not
					stmt.close();
				if(con!=null)
					con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}//end of inner try
		}//end of finally
	}
}
