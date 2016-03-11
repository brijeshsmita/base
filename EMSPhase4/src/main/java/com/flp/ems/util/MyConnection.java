package com.flp.ems.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	private static Connection con=null;
	
	public static Connection getConnection() {
		String driver,url,user,password;
		try {//creating fis
			FileInputStream fis = 
					new FileInputStream("G:\\15thsept\\EMSPhase3\\EMSPhase3\\src\\database.properties");
			Properties prop = new Properties();
			//creating prop
			prop.load(fis);
			//loading files through prop.load
			fis.close();
			driver=prop.getProperty("driver");
			//getting the value from the file by passing the key
			url=prop.getProperty("url");
			user=prop.getProperty("username");
			password=prop.getProperty("password");
			//load and register the driver class at runtime
			Class.forName(driver);
			//create the connection by passing connection url,username,passwd
			con=DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound Exception");
		} catch (SQLException e) {
			System.out.println("SQL Exception");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		return con;
	}
	
	public static Connection getCon() {
		String driver = "oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "scott";
		String password = "oracle";
		try {
			//step 1:- load and register the driver
			Class.forName(driver);
			//step 2:- get the connection by passing URL,USER,PASSWORD	
			con = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			System.out.println("CLassNotFound Exception");
		} catch (SQLException e) {
			System.out.println("SQL Exception");
		}
		
		return con;
	}//end of getCon()
	public static void closeCon() {
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("SQL Exception");
			}
		}//end of if
	}//end of closeCon()
}//end of class
