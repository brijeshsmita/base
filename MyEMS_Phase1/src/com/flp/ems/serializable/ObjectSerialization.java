package com.flp.ems.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.flp.ems.model.emp.Employee;


public class ObjectSerialization {
	
	/*public static void main(String[] args) throws Exception {
		objSerialization(ArrayList<Employee> empList);
		ObjDeSerialization();
		
	}*/
	
	public static void objSerialization(ArrayList<Employee> empList)  {
		File file = new File("src\\Employee.txt");
		
		try(FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
				){
			oos.writeObject(empList);
			oos.flush();
			System.out.println("Object serialization");			
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static ArrayList<Employee> objDeSerialization() throws Exception, IOException {
		File file = new File("src\\Employee.txt");
		ArrayList<Employee> e1 =null ;
		try(FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois= new ObjectInputStream(fis);
				){
			e1 = (ArrayList<Employee>) ois.readObject();
			System.out.println("Deserialized:\n"+e1);
			
		}catch (Exception e){
		 System.out.println(e);
		}
		return e1;
		
}
}
