package com.cg.io.readerwriter;
import java.io.*;
public class  PrintWriterDemo{
  	public static void main (String [ ] args)
  			throws IOException {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println ("hello");
		pw.println ("Hi");
		pw.flush ();
		pw.close();
  	}
}


