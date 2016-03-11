public class Demo1 {
	public static void main(String[] args) {
		int num1,num2;
		double div=0;
		try{
			num1=Integer.parseInt(args[0]);
			num2=Integer.parseInt(args[1]);
			div=num1/num2;
		}catch(ArithmeticException ae){
System.out.println("Number cannot be divisible by ZERO");
		}catch(ArrayIndexOutOfBoundsException ab){
System.out.println("Array values need to passed");			
		}catch (NumberFormatException e) {
System.out.println("Values must be numeric, found String");
		}finally{
			System.out.println("I am always executed weather"
					+ " Exception occurs or not  ");
		}
System.out.println("Division of two numbers is :"+div);

	}

}
