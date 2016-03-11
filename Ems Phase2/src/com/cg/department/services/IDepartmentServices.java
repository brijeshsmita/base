package com.cg.department.services;

import java.util.ArrayList;

import com.cg.department.domain.Department;
import com.cg.exception.EmsException;

public interface IDepartmentServices
{
	void addDepartment(Department d) throws EmsException;
	void removeDepartment(int deptId) throws EmsException;
	Department modifyDepartment(Department d)  throws EmsException;
	Department searchDepartment(int deptId)  throws EmsException;
	ArrayList<Department> listAllDepartment()  throws EmsException;
	void showAllDeptId() throws EmsException;

}
