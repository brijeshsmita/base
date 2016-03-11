package com.flp.ems.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.flp.ems.model.emp.Employee;
import com.flp.ems.serializable.ObjectSerialization;

public class EmployeeDao implements IEmployeeDao {
	private static ArrayList<Employee> empList;
	static{
		empList=new ArrayList<Employee>();
		try {
			empList= ObjectSerialization.objDeSerialization();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public int addEmployee(Employee employee) {
		if(employee != null){
			empList.add(employee);
			return 1;
		}
		return 0;
	}

	@Override
	public int modifyEmployee(Employee employee) {
		int index;
		Employee e=SearchEmployee(employee.getEmpId());
		if (empList.contains(e))
		{
			index= empList.indexOf(e);
			empList.remove(index);
			empList.add(index, employee);
			return 1;
		}
		return 0;
	}

	@Override
	public int removeEmployee(Employee employee) {
		if (empList.contains(employee)){
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
	public Employee SearchEmployee(int empId) {
		Employee e= null;
		for (Employee emp : empList) {
			if(emp.getEmpId()==empId){
				e=emp;
			}
		}
		return e;
	}

	@Override
	public Employee SearchEmployeeByKinID(String kinId) {
		Employee e= null;
		for (Employee emp : empList) {
			if(kinId.equalsIgnoreCase(emp.getKinId())){
				e=emp;
			}
		}
		return e;
	}

	@Override
	public Employee SearchEmployeeByName(String empName) {
		Employee e= null;
		for (Employee emp : empList) {
			if(empName.equalsIgnoreCase(emp.getEmpName())){
				e=emp;
			}
		}
		return e;
	}

	@Override
	public Employee SearchEmployeeByEmail(String email) {
		Employee e= null;
		for (Employee emp : empList) {
			if(email.equalsIgnoreCase(emp.getEmailId())){
				e=emp;
			}
		}
		return e;
	}

	@Override
	public void employeeSerialize() {
		ObjectSerialization.objSerialization(empList);
		
	}


}
