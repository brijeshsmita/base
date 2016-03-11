package com.cg.serilazation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cg.date.MyDate;
public class TestSerialization {
	public static void serializeObject(Object obj,String pathname) 
			throws FileNotFoundException, IOException{
		File file = new File(pathname);
		if(file.exists())
		{	try(
					FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
				oos.writeObject(obj);oos.flush();
				System.out.println("Object Persisted...kindly check,"
						+file.getAbsolutePath());				
			}//end of try			
		}else{
			file.createNewFile();
			System.out.println("New File created");
		}//end of if
	}//end of method
	
	public static Object deserializeObject(String pathname)throws FileNotFoundException, IOException
	, ClassNotFoundException{
		Object obj=null;
		File file = new File(pathname);
		if(file.exists())
		{	try(
					FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
			){
				obj=ois.readObject();		
				System.out.println("Object deserialized");
			}//end of try			
		}else{
			file.createNewFile();
			System.out.println("New File created"); 
		}//end of if
		return obj;
	}//end of method
	public static void main(String[] args)
			throws FileNotFoundException, IOException
			, ClassNotFoundException {
		MyDate obj = new MyDate(11, 11,2015);
		serializeObject(obj, "src\\mydate.txt");
		MyDate d1 = (MyDate)deserializeObject("src\\mydate.txt");
		System.out.println(d1);
	}//end of method
}//end of class
