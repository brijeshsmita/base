package com.cg.date;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestDate {

	public static void main(String[] args) throws IOException
	, ClassNotFoundException {
		File file = new File("src\\date.txt");
		if(file.exists())
		{	try(
					FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
			){
				MyDate d1 = new MyDate();
				d1.setDay(11);d1.setMonth(11);d1.setYear(2015);
				System.out.println(d1);
				//save the date object
				oos.writeObject(d1);
				oos.flush();
//saving the state of the current object on the persistent 
//storage is known as Object Serialization
//it is saved in encrypted form				
				System.out.println("Object persisted Successfuly! check"
							+file.getAbsolutePath());
				
//process of reading the object from the file is known as De-Serialization
				MyDate obj =(MyDate) ois.readObject();
				System.out.println("De-Serialized Date Object : "+obj);
			}
		}else{
			file.createNewFile();
			System.out.println("New File created");
		}

	}

}
