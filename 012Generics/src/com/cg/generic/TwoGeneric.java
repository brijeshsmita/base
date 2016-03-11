package com.cg.generic;
/*
 * @author Smita Brijesh
 */
class TwoGeneric<Type1, Type2> {
	  Type1  a;      Type2   b;
	  TwoGeneric(Type1 x, Type2 y) {
			 a = x; b =y;
	  }
	  void showTypes() {
	  	System.out.println("Type of Type1 : "+a.getClass().getName());
	  	System.out.println("Type of Type2 : "+b.getClass().getName());
	  }
	  Type1 getA() {
	  	return a;
	  }
	  Type2 getB() {
	  	return b;
	  }    
}
