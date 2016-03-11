package com.cg.department.dao;

import java.util.ArrayList;

import com.cg.department.domain.Department;
import com.cg.exception.EmsException;

public interface IDepartmentDao 
{
	void addDepartment(Department d) ;
	void removeDepartment(int deptId) ;
	Department modifyDepartment(Department d) ;
	Department searchDepartment(int deptId) ;
	ArrayList<Department> listAllDepartment() ;
	void showAllDeptId() ;
}
