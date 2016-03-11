package com.cg.arm;
import java.io.IOException;
/*
 * @author Smita Brijesh
 */
public class TestArm 
{
	public static void main(String[] args) throws IOException
	{   
	//try with resource block --new feature in java7
	//declaring the resource within try block
	//it takes care of auto closing the resource
	//only those classes which implements AutoClosable or Closable interface
	//can be initialized within try with resource block
		try(MyArmClass obj = new MyArmClass())
		{
			obj.myMethod();			
		}
	}
}
