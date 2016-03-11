package com.cg.employee.services;

import java.util.ArrayList;

import com.cg.employee.domain.Employee;
import com.cg.exception.EmsException;

public interface IEmployeeServices 
{
	void addEmployee(Employee e)throws EmsException ;
	void removeEmployee(int empNo)throws EmsException ;
	Employee modifyEmployee(Employee e)throws EmsException ;
	Employee searchEmployee(int empNo)throws EmsException ;
	ArrayList<Employee> listAllEmployee()throws EmsException ;
}
