package com.cg.io.readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader {

	public static void main(String[] args) throws FileNotFoundException
	, IOException {
		try(
			FileReader fr = new FileReader("src\\DemoConsole.java");
			BufferedReader br = new BufferedReader(fr);
		){
			String buf=null;
			while((buf=br.readLine())!=null){
				System.out.println(buf);
			}
		}//end of try
	}//end of main
}//end of class
