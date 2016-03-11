package com.cg.arm;

import java.io.IOException;

public class UseDoor {

	public static void main(String[] args) throws IOException {
//try-with-resource block is used to auto close the resources
		//only if the class has implemented 
		//AutoCloseable/Closeable interface
		try(Door doorObj = new Door()){
			doorObj.open();
		}
		//no-need of explicitly calling close
		//doorObj.close();
	}
}
