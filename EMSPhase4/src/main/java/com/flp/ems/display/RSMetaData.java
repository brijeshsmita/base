package com.flp.ems.display;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.flp.ems.model.emp.Employee;
import com.flp.ems.util.MyConnection;


public class RSMetaData {
	
		//to display formatted output
		public static void printing()
		{		
			Connection con=MyConnection.getConnection();
			Statement stmt=null;
			ResultSet rs=null;
			try {
			
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from ems2.Employee");//query to select all rows in db
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int columnCount=rsmd.getColumnCount();//counting number of columns
			
			System.out.println("=============================================================" +
					"=========================================================================" +
					"==========================================================================" +
					"==========================================================================" +
					"==========================================================================");
			System.out.print(rsmd.getColumnLabel(1)+"\t\t|");
			System.out.print(rsmd.getColumnLabel(2)+"\t\t\t|");
			System.out.print(rsmd.getColumnLabel(3)+"\t\t|");
			for(int i=4;i<=columnCount;i++){
				System.out.print(rsmd.getColumnLabel(i)+"\t\t\t|");
			}
			
			System.out.println("\n=============================================================" +
					"=========================================================================" +
					"==========================================================================" +
					"==========================================================================" +
					"==========================================================================");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t\t|"
						+rs.getString(2)+"\t\t\t|"
						+rs.getString(3)+"\t\t|"
						+rs.getString(4)+"\t\t\t|"
						+rs.getString(5)+"\t\t\t|"
						+rs.getDate(6)+"\t\t\t|"
						+rs.getDate(7)+"\t\t\t|"
						+rs.getString(8)+"\t\t\t|"
						+rs.getInt(9)+"\t\t\t|"
						+rs.getInt(10)+"\t\t\t|"
						+rs.getInt(11)+"\t\t\t|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(stmt!=null)
					stmt.close();
					if(con!=null)
						MyConnection.closeCon();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
	}
	}
		
		public static void printingOne(Employee e1)
		{		
			Connection con=MyConnection.getConnection();
			PreparedStatement ps=null;
			ResultSet rs=null;
			try {
			
			String sql="select * from ems2.Employee where empId=?";
			con=MyConnection.getConnection();
			ps=con.prepareStatement(sql);
			
			ps.setInt(1,e1.getEmpId());
			rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int columnCount=rsmd.getColumnCount();//counting no of columns
			
			System.out.println("=============================================================" +
					"=========================================================================" +
					"==========================================================================" +
					"==========================================================================" +
					"==========================================================================");
			for(int i=1;i<=columnCount;i++){
				System.out.print(rsmd.getColumnLabel(i)+"\t\t\t|");//printing column headings
			}
			
			System.out.println("\n=============================================================" +
					"=========================================================================" +
					"==========================================================================" +
					"==========================================================================" +
					"==========================================================================");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t\t\t|" //printing data
						+rs.getString(2)+"\t\t\t|"
						+rs.getString(3)+"\t\t\t|"
						+rs.getString(4)+"\t\t\t|"
						+rs.getString(5)+"\t\t\t|"
						+rs.getDate(6)+"\t\t\t|"
						+rs.getDate(7)+"\t\t\t|"
						+rs.getString(8)+"\t\t\t|"
						+rs.getInt(9)+"\t\t\t|"
						+rs.getInt(10)+"\t\t\t|"
						+rs.getInt(11)+"\t\t\t|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)
					ps.close();
					if(con!=null)
						MyConnection.closeCon();//close connection
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
	}
	}

}

