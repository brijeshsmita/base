package com.cg.test_enum;

public class PayModeDemo {
	/*public static final int CASH=1;
	public static final int CREDIT=2;
	public static final int DEBIT=3;
	public static final int NET=4;
	public static final int PAYTM=5;*/
	public enum PayMode{CASH,CREDIT,DEBIT,NET,PAYTM};
	public static void main(String[] args) {
		System.out.println("You have opted :"+PayMode.CASH);
	}

}
/* enum is a keyword in java , a feature which is used to represent
 * fixed number of well-known values
 * eg: days, month, payment mode,
 * enums in java are type safe.
 * enums in java are reference type just like class and interface
 * we can define construtors, method, variables inside enum
 * we can also specify values of enum contants at the creation time
 */

