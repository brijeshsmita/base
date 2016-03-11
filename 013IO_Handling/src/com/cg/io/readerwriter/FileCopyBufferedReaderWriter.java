package com.cg.io.readerwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBufferedReaderWriter {

	public static void main(String[] args) throws FileNotFoundException
	, IOException {
		try(
			FileReader fr = new FileReader("src\\DemoConsole.java");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("src\\CopyDemoConsole.txt");
			BufferedWriter bw = new BufferedWriter(fw);	
		){
			String buf=null;
			while((buf=br.readLine())!=null){
				bw.write(buf+"\n");
				bw.flush();
				System.out.println(buf);                                                         
			}
			System.out.println("Filed Copied , kindly check "
			+new File("src\\CopyDemoConsole.txt").getAbsolutePath());
		}//end of try
	}//end of main
}//end of class
