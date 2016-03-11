/**
 * 
 */
package com.cg.project.dao;

import java.util.ArrayList;

import com.cg.project.domain.Employee;

/*@author smita*/
public interface IEmployeeDao {
	void addEmployee(Employee e);
	void removeEmployee(int empNo);
	Employee modifyEmployee(Employee e);
	Employee searchEmployee(int empNo);
	ArrayList<Employee> listAllEmployee();
}
