import java.util.ArrayList;

import com.synergy.bank.BankAccount;
/*
 * @author Smita Brijesh
 */
class GenericClass<T> {
	T value1;	T  value2;
	public GenericClass(){		
	}
	public GenericClass(T value1,T value2){		
	}
	public void print(T value){
		System.out.println(value);
	}
	public void display(ArrayList<?> list){//? wildcar
		for(Object obj :list){
			System.out.println(obj);
		}//eo for
	}//e o display
}//eo class
class TestGeneric{
	public static void main(String[] args) {
		GenericClass<String> gc3 = new GenericClass<>();
		ArrayList<String> strList= new ArrayList<String>();				
		strList.add("Smita");
		strList.add("Brijesh");
		strList.add("Kumar");
		strList.add("Nilesh");
		System.out.println("==========String==============");
		gc3.display(strList);
		
		System.out.println("==========Integer==============");
		GenericClass<Integer> gc = new GenericClass<>();
		gc.print(45);
		//gc.print(45.66);//error type safety
		System.out.println("==========Double==============");
		GenericClass<Double> gc1 = new GenericClass<>();
		gc1.print(45.66);
		System.out.println("==========BankAccount==============");
		GenericClass<BankAccount> gc2 = new GenericClass<>();
		gc2.print(new BankAccount("smita", 100000));
		
		
	}
}
/*The above code can be used to create a stack of int, float 
or any type. Here AnyType is the name of type parameter. 
It is the placeholder for the actual type 
that will be passed to GenericStack 
whenever the object of it is created.
Such type of generic class is also known as parameterized type.
The AnyType placeholder must be given between < >.
Whenever we create an instance of this parameterized type, 
we have to provide the actual type between the angular brackets.*/
