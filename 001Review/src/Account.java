class Account {
	int accNumber;
	String accHolderName;
	double balance;
	public void print(){
		System.out.println("============Account Details===============\n"
				+ "\nAccount Id 	    	:"+accNumber
				+ "\nAccount Holder Name  	:"+accHolderName
				+ "\nBalance			    :"+balance);
	}
	public void setAccount(int accNo, String name,double bal)
	{
		accNumber=accNo;
		accHolderName=name;
		balance=bal;
	}
	
	public static void main(String[] args) {
		//we created the class
		//now e will learn to create object of a class
		Account a1 = new Account();
		a1.setAccount(1111, "Smita", 8888);
		a1.print();
		
		Account a2 = new Account();
		a2.setAccount(2222, "Sita", 47574);
		a2.print();
		
		Account a3 = new Account();
		a3.setAccount(3333, "Rita",99999);
		a3.print();
	}
}
