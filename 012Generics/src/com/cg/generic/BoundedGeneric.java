package com.cg.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedGeneric {
	public static void main(String[] args) {
	//List of Integer
		List<Integer> intList = Arrays.asList(10,20,30,40);
		System.out.println("Adding Integers : "+sum(intList));
	//List of Double
		List<Double> doubleList = Arrays.asList(10.5,20.9,30.1,40.7);
		System.out.println("Adding Double : "+sum(doubleList));
	//List of String
		List<String> strList = Arrays.asList("10","20","30","40");
//error		//System.out.println("Adding String : "+sum(strList));
//Testing lower Bound wildcard
		//list of SUVCar
	List<SUVCar> suvCarList = new ArrayList<SUVCar>();
		suvCarList.add(new SUVCar());
		addCar(suvCarList);
		
		//list of Car
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car());
		addCar(carList);
		
		//list of FourWheeler
		List<FourWheeler> fourWheelerList = 
				new ArrayList<FourWheeler>();
		fourWheelerList.add(new FourWheeler());
		addCar(fourWheelerList);
	
	}//end of main
	private static Number sum(List<? extends Number>numList){
		double sum=0.0;
		for(Number num : numList){
			sum+=num.doubleValue();
		}
		return sum;		
	}
	
	//LowerBounded wild card
	//allows to accept all types which is super type
	//of SUVCar
	public static void addCar(List<? super SUVCar> car){
		car.add(new SUVCar());
		System.out.println(car);
	}
}//end of class
class Vehicle{
	
}
class FourWheeler extends Vehicle{
	
}
class Car extends FourWheeler{
	
}
class SUVCar extends Car{
	
}