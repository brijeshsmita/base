package com.cg.arm;
import java.io.IOException;
/*
 * @author Smita Brijesh
 */
public class MyArmClass implements AutoCloseable
{
	public void myMethod() 
	{
		System.out.println("\nHello My Class Method");
	}
	@Override
	public void close() throws IOException 
	{
		System.out.println("Hi I am about to Close  "
				+ "with the help of Closeable interface close method");
	}
	
}
