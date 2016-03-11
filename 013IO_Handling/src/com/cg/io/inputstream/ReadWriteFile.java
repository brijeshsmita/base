package com.cg.io.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ReadWriteFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//readFromFile("src\\com\\cg\\io\\inputstream\\ReadWriteFile.java");
		//readFromFile("src\\com\\cg\\io\\file\\FileClassDemo.java");
		//readFromFile("src\\demo.txt");
		copyFile("src\\com\\cg\\io\\file\\FileClassDemo.java"
		, "src//FileClassDemo.txt");
		//copyFile("src\\Koala.jpg", "src//CopyKoala.jpg");
	}	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
//writing on file	
	public static void writeOnFile(String strFile){		
		FileOutputStream fos=null;
		File file=null;
		try {			
			file= new File(strFile);
			fos= new FileOutputStream(file);
			int b = 10;
			fos.write('A');
			fos.flush();
			fos.write(b);
			fos.flush();
			fos.write('\n');
			byte [] bArr={'h','e','l','l','o'};
			fos.write(bArr);
			fos.flush();
			System.out.println("Written byte on File Successfully"
					+ ", Check out  "+file.getAbsolutePath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();//releasing of resource
					System.out.println("Resource closed successfully!");
				} catch (IOException e) {
					e.printStackTrace();
				}//end of inner try
			}else
				System.out.println("Resource already closed!");
		}//end of finally
		
	}//end of write method
	
//reading from file
	public static void readFromFile(String strFile){
		FileInputStream fis =null;
		File file =null;
		try {
			int ch;
			file= new File(strFile);
			fis= new FileInputStream(file);
			while((ch=fis.read())!=-1){//EOF is depicted by -1
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();//releasing of resource
					System.out.println("Resource closed successfully!");
				} catch (IOException e) {
					e.printStackTrace();
				}//end of inner try
			}else
				System.out.println("Resource already closed!");
		}//end of finally
	}
//copying file
	public static void copyFile(String sourceFile,String destFile) throws FileNotFoundException, IOException{
		try(FileInputStream fis= new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile)){
			int ch;
			while((ch=fis.read())!=-1){//reading
				fos.write(ch);//writing
			}	
			System.out.println("File Copied Successfully, kindly check, "
					+new File(destFile).getAbsolutePath());
		}
	}

	

}
