package com.cg.io.randomaccess;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class DemoRandomAccess {
	public static void main(String[] args)  {
		randomFileAccess(new File("src//DemoConsole.java"));

	}
	public static void randomFileAccess(File file) 
	{
		RandomAccessFile reader;
		try {
			reader = new RandomAccessFile(file, "r");
			
			reader.seek(10);//will move the filePointer to the 10 index
			int a=0;
			while((a=reader.read())>-1)	{
				System.out.print((char)a);
				//reader.skipBytes(2);
				// it will skip 2 bytes after reading each char
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
