package com.cg.main;

import java.sql.Connection;

import com.cg.connection.MyConnection;

public class TestConnection {
	public static void main(String[] args) {
		/*Connection con=MyConnection.getCon();
		if(con!=null)
			System.out.println("Connection Obtained....");
		else
			System.out.println("Sorry Boss! Something went worng"
					+ "Connection not established");
*/
		MyConnection.getConnection();
	}

}
