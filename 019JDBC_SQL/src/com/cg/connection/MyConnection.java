package com.cg.connection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	static Connection con=null;
	public static Connection getConnection(){
		File file = new File("src//oracle.properties");
		Properties prop=null;
		try {
			FileInputStream fis=new FileInputStream(file);
			 prop= new Properties();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		//System.out.println("Loading the driver class");
		try {
			Class.forName(driver);
			//System.out.println("driver class loaded successfully!");
			con=DriverManager.getConnection(url, username, password);
			//System.out.println("Connection obtained successfully!\n"+con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;		
	}//eo get con
	public static void closeConnection(){
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		//System.out.println("Connection Closed");
	}
	
	public static void main(String[] args) {
		getConnection();
		closeConnection();
	}

}
