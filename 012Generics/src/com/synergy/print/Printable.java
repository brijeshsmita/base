package com.synergy.print;
//--by default all interface are abstract therefore no need of abstract keyword
public interface Printable {
	//ERROR//void print(){}//by default all methods in an interface are (abstract and public)
	//THEREFORE METHOD CANT HAVE BODY
	
	void print();
	
	int MAX_PRINT=100;
	//by default all variables in an interface are (public,static and final)
	//THEREFORE MUST BE INITIALIZED
}
