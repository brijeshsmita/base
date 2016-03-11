package com.cg.jdbc;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import com.cg.connection.MyConnection;
public class DBMetaData {
	public static void main(String[] args) {
		Connection con=MyConnection.getConnection();		
		try {
DatabaseMetaData dbmd = con.getMetaData();
System.out.println("\n==========================================");
System.out.println("Driver Name :"+dbmd.getDriverName());
System.out.println("Database Name :"
+dbmd.getDatabaseProductName());
System.out.println("Driver Major Version :"
+dbmd.getDriverMajorVersion());
System.out.println("Driver Minor Version :"
+dbmd.getDriverMinorVersion());
System.out.println("User Name :"+dbmd.getUserName());
		} catch (Exception e) {
			e.printStackTrace();
		}//end of catch
		finally{
			try {
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}//end of inner catch
		}//end of finally
	}//end of main
}//end of class






