package com.cg.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.connection.MyConnection;

public class RessultSetMethods {
	public static void main(String[] args) {
		Connection con  =MyConnection.getConnection();
		String selectQuery="select * from cg.employee";
		ResultSet rs=null;
		Statement stmt=null;
		//enable the resultset cursor type to updatable
		//enable the resultset scroll type to scrollable
		try {
			stmt= con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_SENSITIVE);
			
			rs= stmt.executeQuery(selectQuery);
			
			//printing the resultset in reverse direction
			rs.afterLast();//moving cursor to after last record
			System.out.println("==========Revers order Resultset=======");
			while(rs.previous()){
				System.out.println(rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+rs.getDouble(3));
			}
			//printing to the first record
			rs.first();
			System.out.println(rs.getInt(1)+"\t"+
					rs.getString(2)+"\t"+rs.getDouble(3));
			//printing to the last record
			rs.last();
			System.out.println(rs.getInt(1)+"\t"+
					rs.getString(2)+"\t"+rs.getDouble(3));
			//printing to the 2nd record
			rs.absolute(2);
			System.out.println(rs.getInt(1)+"\t"+
					rs.getString(2)+"\t"+rs.getDouble(3));
			//printing to the 3rd record from the current position
			rs.relative(3);
			System.out.println(rs.getInt(1)+"\t"+
					rs.getString(2)+"\t"+rs.getDouble(3));
			
			/*//insert record in rs
			rs.moveToInsertRow();
			rs.updateInt(1, 141);
			rs.updateString(2, "Smita");
			rs.updateDouble(3, 9999.99);
			rs.insertRow();
			System.out.println("==========Resultset=======");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+rs.getDouble(3));
			}	
			
			//update record in rs
			rs.first();
			rs.updateInt(1, 101);
			rs.updateString(2, "Dreena");
			rs.updateDouble(3, 9999.99);
			rs.updateRow();
			
			//delete record in rs
			rs.last();			
			rs.deleteRow();*/
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{//close the resource
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
