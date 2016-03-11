package com.cg.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

public class MyConnection {
	private static Connection con=null;/*
	private static DataSource ds=null;
	public static DataSource getDataSource(){
		if(ds==null){
			FileInputStream fis;
			try {
				fis = new FileInputStream("src//database.properties");
				Properties p = new Properties();
				p.load(fis);fis.close();
				//String driver= p.getProperty("driver");
				String url= p.getProperty("url");
				String username= p.getProperty("username");
				String password=p.getProperty("password");
				//create datasource using mysql
				MysqlDataSource mySqlDs = new MysqlDataSource();
				mySqlDs.setConnectionCollation("10");
				//number of connection object in the pool
				mySqlDs.setUrl(url);
				mySqlDs.setUser(username);
				mySqlDs.setPassword(password);
				ds=mySqlDs;
			}//endof try
			catch(FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end of if
		return ds;
	}
	*/
	public static void main(String[] args) {
		try {
		//	DataSource ds =getDataSource();
		//	Connection con = ds.getConnection();
			Connection con = getConnection();
			System.out.println(con);
			//System.out.println(getDataSource().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		String driver,url,user,password;
		try {//creating fis
			FileInputStream fis = 
			new FileInputStream("src//database.properties");
			Properties prop= new Properties();
			//creating prop
			prop.load(fis);
			//loding file through prop.load
			fis.close();
			driver=prop.getProperty("driver");
			//getting the value from the file by passing the key			
			url=prop.getProperty("url");
			user=prop.getProperty("username");
			password=prop.getProperty("password");
//load and register the driver class at runtime
			Class.forName(driver);
/*get the connection by passing connection _url,username,pwd
	to the DriverManger.getConnection() method
 */			con=DriverManager.getConnection(url, user, password);
			 if(con!=null)
				 System.out.println("Connection Obtained!!!");
			 else
				 System.out.println("Sorry boss! unable to connect");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return con;
	}//end of MyConnection
	
	//for testing connection
	public static Connection getCon(){
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="scott";
		String password="oracle";
		try {
//step 1 : load and register the driver
			Class.forName(driver);
//step 2 : get the connection by passing URL,USER,PASSWORD
			con=DriverManager.getConnection(url, username
					, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}//end of getCon() method
	//method for closing the connection
	public static void closeCon() {
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end of if
	}//end of closeCon() method
}//end of class
