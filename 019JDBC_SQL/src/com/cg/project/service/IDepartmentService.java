/**
 * 
 */
package com.cg.project.service;

import java.util.ArrayList;

import com.cg.project.domain.Department;

/*@author smita*/
public interface IDepartmentService {
	void addDepartment(Department department);
	void removeDepartment(int deptNo);
	Department modifyDepartment(Department department);
	Department searchDepartment(int deptNo);
	ArrayList<Department> listAllDepartment();
}
