package com.cg.forwhile;
//how many package statement
//none or one
//must be first line of .java file
import java.util.Scanner;
//we can import only public class
//how many import statements -none or many
//must be second line of .java file
public class ForWhileTest {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			System.out.println("Hello World");
		}
		int y=1;
		while(y>=5){
			System.out.println("Hello World");
			y++;
		}
		Scanner scan = new Scanner(System.in);
		int ch=0;
		String choice="";
		do{			
			System.out.println("Enter your choice : "
					+ "	\n Addition"
					+ "	\n Substraction"
					+ "	\n Multiplication"
					+ "	\n Division");
			ch=scan.nextInt();
			System.out.println("Do You Want to Continue....(Yes/No)");
			choice=scan.next();
			if(choice.equalsIgnoreCase("no")){
				break;
			}else{
				System.out.println("Wrong Input");
				continue;
				/*System.out.println("Do You Want to Continue....(Yes/No)");
				choice=scan.next();*/
			}
		}while(choice.equalsIgnoreCase("yes"));
	}
}
