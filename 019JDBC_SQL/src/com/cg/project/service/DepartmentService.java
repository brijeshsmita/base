package com.cg.project.service;

import java.util.ArrayList;

import oracle.net.aso.d;

import com.cg.project.dao.DepartmentDao;
import com.cg.project.dao.IDepartmentDao;
import com.cg.project.domain.Department;
import com.cg.project.domain.Employee;

public class DepartmentService implements IDepartmentService {
	private static IDepartmentDao departmentDao;
	static{
		departmentDao = new DepartmentDao();
	}	
	@Override
	public void addDepartment(Department department) {
		departmentDao.addDepartment(department);
	}

	@Override
	public	void removeDepartment(int deptNo) {
		departmentDao.removeDepartment(deptNo);
	}

	@Override
	public Department modifyDepartment(Department department){
		return departmentDao.modifyDepartment(department);
	}

	@Override
	public Department searchDepartment(int deptNo){
		return departmentDao.searchDepartment(deptNo);
	}

	@Override
	public ArrayList<Department> listAllDepartment() {
		return departmentDao.listAllDepartment();
	}

}
