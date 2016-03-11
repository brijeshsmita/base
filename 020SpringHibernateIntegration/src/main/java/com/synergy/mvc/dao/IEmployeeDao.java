package com.synergy.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.synergy.mvc.domain.Employee;
@Repository
public interface IEmployeeDao {
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);

}
