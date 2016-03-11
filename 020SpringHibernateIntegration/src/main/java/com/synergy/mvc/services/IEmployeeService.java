package com.synergy.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.synergy.mvc.domain.Employee;
@Service
public interface IEmployeeService {
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);

}
