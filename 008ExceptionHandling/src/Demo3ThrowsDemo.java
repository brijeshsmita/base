public class Demo3ThrowsDemo {
	public static void main(String[] args){
		Test t1 = new Test();
		t1.check(args);
		//new Test().check(args);
	}
}
class Test{
	public void check(String [] args)throws 
	ArithmeticException,
	NumberFormatException,
	ArrayIndexOutOfBoundsException {
		int num1,num2,div=0;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		div=num1/num2;
		System.out.println("Division of Two numbers is "
		+div);
	}
	
}
