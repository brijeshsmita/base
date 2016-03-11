package com.cg.arm;

import java.io.IOException;

public class Door implements AutoCloseable{
	public void open(){
		System.out.println("Door Opened");
	}
	
	public void close() throws IOException{
		System.out.println("Door Closed automatically");
	}
}
