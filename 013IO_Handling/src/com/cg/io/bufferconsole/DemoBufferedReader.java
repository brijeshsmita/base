package com.cg.io.bufferconsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoBufferedReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Your Name : ");
		try(	
			InputStreamReader in = new InputStreamReader(System.in);
				//reading from standard input device
			BufferedReader br = new BufferedReader(in);//creating buffer
		){
			String inputString=br.readLine();
			System.out.println("Hello , "+inputString);
		}
	}//end of main
}//end of class
