package com.cg.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileClassDemo {
	public static void main(String[] args) {
		File file =null;
		try {
			file=new File("src\\demo.txt");			
			if(file.exists()){
				System.out.println("File Exists!");
				System.out.println("Is File a Directory : "+file.isDirectory());
				System.out.println("Is File? : "+file.isFile());
				System.out.println("Absolute Path : "+file.getAbsolutePath());
				System.out.println("Path : "+file.getPath());
				System.out.println("Can Write : "+file.canWrite());
				System.out.println("Can Read : "+file.canRead());
				System.out.println("Is Hidden? : "+file.isHidden());
				System.out.println("Last Modified : "+file.lastModified());
				System.out.println("File Length : "+file.length());
			}else{
				file.createNewFile();
				System.out.println("Sorry! File does not exists!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

