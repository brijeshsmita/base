package com.cg.test_enum;
//we can define abstract method inside an enum, 
//each constant then implements each abstract method independently
public enum Car {
	AUDI{
		@Override
		public int getPrice() {			
			return 2500;
		}		
	},
	BMW{
		@Override
		public int getPrice() {			
			return 1500;
		}		
	},
	MERCEDES{
		@Override
		public int getPrice() {			
			return 3500;
		}		
	};	
	public abstract int getPrice();
	//we can compare two enum with == and equals() OR compareTo()
	public static void main(String[] args) {
		Car c1 = Car.AUDI;
		if(c1==Car.BMW){
			System.out.println("enum can be compared using ==");
		}else{
			System.out.println("enum can be compared using equals() &compareTo()");
		}
	}
}
