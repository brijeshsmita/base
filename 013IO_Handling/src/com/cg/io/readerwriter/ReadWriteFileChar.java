package com.cg.io.readerwriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ReadWriteFileChar {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//writeOnFile("src\\demochar.txt");
		//readFromFile("src\\demochar.txt");
		//readFromFile("src\\com\\cg\\io\\file\\FileClassDemo.java");
		/*copyFile("src\\com\\cg\\io\\file\\FileClassDemo.java"
				, "src//CharFileClassDemo.txt");*/
		copyFile("src\\Koala.jpg", "src//CharCopyKoala.jpg");
	}	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
//writing on file	
	public static void writeOnFile(String strFile) throws IOException{	
		File file =new File(strFile);
		if(file.exists()){
			try(FileWriter fw = new FileWriter(file);){				
				fw.write('A');fw.write('\n');
				char [] cbuf={'h','e','l','l','o'};
				fw.flush();
				fw.write(cbuf);
				System.out.println("Written byte on File Successfully"
						+ ", Check out  "+file.getAbsolutePath());
			}//end of try
		}else{
			file.createNewFile();
			System.out.println("File Created!!");
		}
	}//end of write method
	
//reading from file
	public static void readFromFile(String strFile) throws FileNotFoundException, IOException{
		File file =new File(strFile);
		if(file.exists()){
			try(FileReader fr = new FileReader(file);){
				int ch;
				while((ch=fr.read())!=-1){
					System.out.print((char)ch);
				}
			}//end of try
		}else{
			file.createNewFile();
			System.out.println("File Created!!");
		}
	}
//copying file
	public static void copyFile(String sourceFile,String destFile) throws FileNotFoundException, IOException{
		try(FileReader fr = new FileReader(sourceFile);
			FileWriter fw = new FileWriter(destFile)	
				
			){
			int ch;
			while((ch=fr.read())!=-1){//reading
				fw.write(ch);//writing
			}	
			System.out.println("File Copied Successfully, kindly check, "
					+new File(destFile).getAbsolutePath());
		}
	}
}
