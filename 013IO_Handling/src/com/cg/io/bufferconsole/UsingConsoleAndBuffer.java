package com.cg.io.bufferconsole;
/**
 * @author Smita
 **/
	import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 public class UsingConsoleAndBuffer {
	   public static void main(String[] args) 
			   throws IOException {
	      //usingConsoleReader();
	      usingBufferedReader("src\\employee.txt");
	   }	//end of main 
	   private static void usingBufferedReader(String pathname) throws IOException
	   {
		   File file = new File(pathname);
		  try(
				  BufferedReader bufferRead = 
				  	new BufferedReader(new InputStreamReader(System.in));
				  FileWriter fw= new FileWriter(file)
			){
			  if(file.exists()){
			     System.out.println("Enter Employee Name: ");
			     String inputString = bufferRead.readLine();		      
			     System.out.println("Name entered : " + inputString);
			     fw.write("Employee Name: "+inputString);
			     fw.flush();
			     System.out.println("Written String on File Successfully"
							+ ", Check out  "+file.getAbsolutePath());
			  }else {
				  file.createNewFile();
				System.out.println("File Created!!");
			}
		  }//end of try
	   }//end of method
	    
	   private static void usingConsoleReader()
	   {
	      Console console = null;
	      String inputString = null;
	      String password=null;
	      try  {    // creates a console object
	         console = System.console();
	         // if console is not null
	         if (console != null){
	            // read line from the user input	          
	       inputString = console.readLine("Enter Name: ");
	            // read line from the user input
	            password = 
	  new String(console.readPassword("Enter Password: "));
	            // prints
	            System.out.println("Name entered : " 
	            + inputString+" and Password is : "+password);
	            // prints	           
	         }
	         else{
	        	 System.out.println("Console is null");
	         }
	      } catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	   }
	 
	  
	   private static void usingScanner()
	   {
	      System.out.println("Name: ");
	      Scanner scanIn=null;
	     try {
	    	  scanIn= new Scanner(System.in);
		      String inputString = scanIn.nextLine();
		      System.out.println("Name entered : " + inputString);
		} catch (Exception e) {
			e.printStackTrace();
			  
		} finally{
			scanIn.close();   
		}
	   }
	    
	}