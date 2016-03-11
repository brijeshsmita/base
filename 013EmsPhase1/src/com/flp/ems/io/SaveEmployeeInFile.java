package com.flp.ems.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.flp.ems.model.emp.Employee;

public class SaveEmployeeInFile {
	public static void addEmployeeList(ArrayList<Employee> empList){
		if(empList!=null)
		{
			File file=null;FileOutputStream fos=null;
			ObjectOutputStream oos=null;
			try{
				file = new File("src//Employee.txt");
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				for(Employee e : empList){
					oos.writeObject(e);
					oos.flush();
				}
				System.out.println("Employee List added successfully");
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					if(fos!=null)
						fos.close();
					if(oos!=null)
						oos.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		}
	}
}
