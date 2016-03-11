import java.util.Scanner;

public class AssertTest {
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		age=scan.nextInt();
		//by default assertion are disabled
		//inorder to enable assertion
		//-ea command is used
		assert age>=18:"Minor-Not Eligible to Vote";		
		System.out.println("Age is "+age);			
	}
}
