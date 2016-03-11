/*
 * @author Smita Brijesh
 */
public class Demo01OuterClass {
	int out=10;
	
	class Inner{
		int in = 15;
		public void getInner(){
			System.out.println("Outer class member can be accesed from Inner class"+out);
			//new Demo01OuterClass().getOuter();
		}
	}//end of InnerClass
	public void getOuter(){
//error
		/*System.out.println("Inner class member cant be 
		accessed from outer class"+in);*/
	}	
	public static void main(String[] args) {
		Demo01OuterClass outer = new Demo01OuterClass();
		Inner innerObj1 = outer.new Inner();
		Inner innerObj2 = new Demo01OuterClass(). new Inner();
		innerObj2.getInner();
		//inner class object cannot call outer class method
		outer.getOuter();
	}

}
