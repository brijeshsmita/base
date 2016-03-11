package com.flp.ems.dao.impl;
import java.util.ArrayList;
import com.flp.ems.dao.EmployeeDao;
import com.flp.ems.model.emp.Employee;
public class EmployeeDaoImpl implements EmployeeDao {
	private static ArrayList<Employee> empList;
	static{
		empList= new ArrayList<Employee>();
	}
	@Override
	public int addEmployee(Employee employee) {
		if(employee !=null){
			int index=empList.size();
			empList.add(index,employee);
			return 1;
		}
		return 0;
	}

	@Override
	public int modifyEmployee(Employee employee) {
		Employee emp=new Employee();		
		if(employee !=null){
			for(Employee e1 : empList)
			{		
				if(e1.getEmpId()==employee.getEmpId()){
					int index=empList.indexOf(employee);
					empList.remove(index);
					//remove old employee
					//and then addd modified employee
					empList.add(index,employee);
					return 1;
				}
			}
		}
		return 0;
	}
	@Override
	public int removeEmployee(Employee employee) {
		if(empList.contains(employee))
		{
			empList.remove(employee);
			return 1;
		}
		return 0;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		return empList;
	}

	@Override
	public Employee searchEmployee(int empId) {
		Employee emp=new Employee();
		for(Employee e1 : empList){
			if(e1.getEmpId()==empId){
				System.out.println("Employee Found");
				emp=e1;
			}
			else
				System.out.println("Employee Not found");
		}
		return emp;
	}

	@Override
	public Employee searchEmployeeByKinId(String kinId) {
		Employee emp=new Employee();
		for(Employee e1 : empList){
			if(e1.getKinId().equals(kinId)){
				System.out.println("Employee Found");
				emp=e1;
			}
			else
				System.out.println("Employee Not found");
		}
		return emp;
	}

	@Override
	public Employee searchEmployeeByName(String empName) {
		Employee emp=new Employee();
		for(Employee e1 : empList){
			if(e1.getEmpName().equals(empName)){
				System.out.println("Employee Found");
				emp=e1;
			}
			else
				System.out.println("Employee Not found");
		}
		return emp;
	}

	@Override
	public Employee searchEmployeeByEmail(String emailId) {
		Employee emp=new Employee();
		for(Employee e1 : empList){
			if(e1.getEmailId().equals(emailId)){
				System.out.println("Employee Found");
				emp=e1;
			}
			else
				System.out.println("Employee Not found");
		}
		return emp;
	}

}
