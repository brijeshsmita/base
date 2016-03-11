package com.cg.sql;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	private PreparedStatement ps;
	private ResultSet rs;
	static int id=101;
	//init block
	{
		con=MyConnection.getConnection();
	}
	public void insertImage(File file){
String sql="insert into test.Image_Master values(?,?,?)";
FileInputStream fis=null;
		try {//creating FileInputStream
			fis=new FileInputStream(file);
		//obatining ps
			ps= con.prepareStatement(sql);
		//setting the values of ps place holders
			ps.setInt(1,(int)Math.random()*111 +id++);
			ps.setString(2, file.getName());
			//int length=(int) file.length();
		//blob type value(placeHolder,fis,lengthOfFile)
			ps.setBinaryStream(3, (InputStream)fis,fis.available());
		//executing the ps	
			int no_of_rec=ps.executeUpdate();
			if(no_of_rec==0) 
				System.out.println("Sorry Boss! something went wrong");
			else
				System.out.println("Image inserted into DB");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null)
					fis.close();
				if(ps!=null)
					ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//end of insertImage() method
	public void getImage(){		
		String sql="select * from test.Image_Master";
		try {		
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
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
				if(ps!=null)
					ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//end of getImage()
	public static void main(String[] args) {
		BlobTest obj1= new BlobTest();
		//obj1.insertImage(new File("src//Penguins.png"));
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
