/**
 * 
 */
package com.cg.project.dao;

import java.util.ArrayList;

import com.cg.project.domain.Department;
import com.cg.project.domain.Employee;

/*@author smita*/
public interface IDepartmentDao {
	void addDepartment(Department department);
	void removeDepartment(int deptNo);
	Department modifyDepartment(Department department);
	Department searchDepartment(int deptNo);
	ArrayList<Department> listAllDepartment();
}
