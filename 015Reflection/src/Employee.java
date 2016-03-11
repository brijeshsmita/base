

import java.io.Serializable;

class Employee implements Serializable{
	private static final long serialVersionUID = -5323420875991245455L;
	private int empId;
	private String ename;
	private double salary;
	//transient var does persist
	private transient String password;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String ename, double salary, String password) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.password = password;
	}
	public Employee(int empId, String ename) {
		super();
		this.empId = empId;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", salary="
				+ salary + ", password=" + password + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
