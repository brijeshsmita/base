public class Demo2MultiCatchJava7 {
	public static void main(String[] args) {
		System.out.println("\nSome Code out side of Finally Block");
		int num1,num2;
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			System.out.println("Ans	:-	"+(num1/num2));
		}//in case of multi catch, catch statement must be always in sub to super	
		catch (NumberFormatException|ArithmeticException
				|ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("\nSorry Boss "+e);
			e.printStackTrace();
		}
		finally{
			System.out.println("\nI all ways get Executed");
		}
	}

}
