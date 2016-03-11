package com.cg.test_enum;
//enum can also extends a class and inplements interface
public enum EnumDay {
	//constants are implicitly static and final
	MON(1),TUE(2),WED(3),THUR(4),FRI(5),SAT(6),SUN(7);
	
	private int value;
	///constructor in enum must be private
	private EnumDay(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		switch (this) {
		case MON:
			return "Monday : "+value;
		case TUE:
			return "Tuesday : "+value;
		case WED:
			return "Wednesday : "+value;
		case THUR:
			return "Thursday : "+value;
		case FRI:
			return "Friday : "+value;
		case SAT:
			return "Saturday : "+value;
		case SUN:
			return "Sunday : "+value;
		default:
			return null;
		}		
	}	
	public static void main(String[] args) {
		EnumDay today = EnumDay.WED;
		System.out.println(today);
	}
}
//we can also override toString in enum
