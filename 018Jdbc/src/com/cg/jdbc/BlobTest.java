package com.cg.jdbc;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.cg.connection.MyConnection;

public class BlobTest {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	static int id=101;
	//init block
	{
		con=MyConnection.getConnection();
	}
	public void insertImage(File file){
String insertQuery="insert into cg.Image_Master values(?,?,?)";
FileInputStream fis=null;
		try {
			file = new File("src//Penguins.jpg");
			fis=new FileInputStream(file);
			pstmt= con.prepareStatement(insertQuery);
			pstmt.setInt(1, id++);
			pstmt.setString(2, file.getName());
			int length=(int) file.length();
			pstmt.setBinaryStream(3, fis,length);
			
			int no_of_rec=pstmt.executeUpdate();
			if(no_of_rec==0)
				System.out.println("soory boss! something went wrong");
			else
				System.out.println("record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null)
					fis.close();
				if(pstmt!=null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void  getImage(){		
		String selectQuery="select * from cg.Image_Master";
		try {		
			pstmt = con.prepareStatement(selectQuery);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int imageid= rs.getInt(1);
				String imagename= rs.getString(2);
				InputStream src = rs.getBinaryStream(3);
				try(BufferedInputStream reader = 
						new BufferedInputStream(src))
				{
					try(PrintStream writer= new PrintStream(
							new File("src\\copy"+imagename)))
					{
						byte [] data = new  byte[50];
						while((reader.read(data))>-1)
						{
							writer.write(data);
						}//end of while
					}//end of inner try with resource
				}//end of try with resource
			}//end of if
			System.out.println("\nImage get Store into src\\");
		}//end of outer try
		catch (Exception e) {
			e.printStackTrace();
		}//end of catch
		finally{
			try {
				if(pstmt!=null)
					pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//end of getImage()
	public static void main(String[] args) {
		BlobTest obj1= new BlobTest();
		obj1.insertImage(new File("src//Penguins.jpg"));
		obj1.getImage();
		try {
			if(obj1.con!=null)
				obj1.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
/*create table Image_Master
(imageno number(2) constraint image_pk primary key ,
	imagename varchar2(50) not null,
	image blob);*/
