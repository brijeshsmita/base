package com.cg.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import com.cg.connection.MyConnection;
public class DemoStatement {
	public static void showAllRecords(){
		String sql="select * from myemp";
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
		//step 1 : get connection
			con=MyConnection.getConnection();
		//step 2: obtain statement obj
			stmt= con.createStatement();
		//step 3: execute sql
			rs=stmt.executeQuery(sql);
		//obtain ResultSetMetaData obj
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount=rsmd.getColumnCount();
		System.out.println("Number of colums is: "
				+columnCount);
		//print the records hold in the resultset
		System.out.println("\n================================================================");
		for(int i=1; i<=columnCount ;i++){
	
			System.out.print(rsmd.getColumnLabel(i)
					+"-"+rsmd.getColumnTypeName(i)+"|");
		}
		System.out.println("\n=============================================================");
		//step 4: traverse ResultSet
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t\t|"
						+rs.getString(2)+"\t\t|"
						+rs.getString(3)+"\t\t|"
						+rs.getString(4)+"\t\t|"
						+rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		showAllRecords();
	}
}
