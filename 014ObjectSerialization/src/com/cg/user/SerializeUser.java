package com.cg.user;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class SerializeUser {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Enter username,password,role");
		int id=(int) (100+Math.random()*111.11);
		String username,password,role;
		User obj=null;
		File file = new File("src\\user.txt");
		if(!file.exists())
			file.createNewFile();
		try(
			//for accepting inupt from user
				BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
			// for serialization-writing the object on to the file
				FileOutputStream fos = new FileOutputStream(file,true);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			//for deserialization-reading the object from the file
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois= new ObjectInputStream(fis);
			){
		//accepting input from user
			//id=br.read();
			username=br.readLine();
			password=br.readLine();
			role=br.readLine();
		//creating user object
			 obj= new User(id, username,password,role);
		//now serialization-writing the object on to the file
			 oos.writeObject(obj);
			 oos.flush();
		//flush() clears anything which is buffered by outputstream
			 System.out.println("User object serialized , check "
					 +file.getAbsolutePath());
			 System.out.println("De-sializing User Object...");
			 User user= (User)ois.readObject();
			System.out.println(user);
		}//end of try
	}//end of main
}
