package com.cg.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.connection.MyConnection;

public class RSMetaData {
	public static void main(String[] args) {
		Connection con=MyConnection.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		try {
			stmt= con.createStatement();
			rs=stmt.executeQuery("select * from myemp");
			//obtain ResultSetMetaData obj
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Number of colums is: "
					+rsmd.getColumnCount());
			//print the records hold in the resultset
			System.out.println("\n==========================================");
			for(int i=1; i<=3 ;i++){

				System.out.print(rsmd.getColumnLabel(i)
						+"-"+rsmd.getColumnTypeName(i)+"\t|");
			}
			System.out.println("\n===============================================");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t\t|"
						+rs.getString(2)+"\t\t\t|"
						+rs.getString(3)+"\t\t|"
						+rs.getString(4)+"\t\t|"
						+rs.getString(5)+"\t\t|");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}//end of catch
		finally{
			try {
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//end of finally
	}//end of main
}//end of class






