/*
 * @author Smita Brijesh
 */
//StaticInnerClass has the same behavior of static method
public class Demo02StaticInner {
	int out=10;
	static int count =5;
	static class StaticInnerClass{
		int staticInt=10;
		public void getInner(){
//error//System.out.println("Only static member of Outer class can be accesed from Static inner class Inner class"+out);
			System.out.println(count++);
		}
	
	}//end of StaticInnerClass
	public static void main(String[] args) {
		StaticInnerClass stInner = new Demo02StaticInner.StaticInnerClass();

	}
}
