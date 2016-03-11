package com.cg.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class DemoSequenceInput {
	public static void main(String[] args) throws FileNotFoundException
		, IOException {
		try(
			FileInputStream f1 = new FileInputStream("src\\demo.txt");
		FileInputStream f2 = new FileInputStream("src\\DemoConsole.java");
				SequenceInputStream seq= new SequenceInputStream(f1,f2);
		){
			int b;
			while((b=seq.read())!=-1){
				System.out.print((char)b);
			}
		}//end of try
	}//end of main
}
