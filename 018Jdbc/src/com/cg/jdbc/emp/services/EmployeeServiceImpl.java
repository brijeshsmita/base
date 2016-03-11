/**
 * 
 */
package com.cg.jdbc.emp.services;
import com.cg.jdbc.emp.dao.EmployeeDao;
import com.cg.jdbc.emp.dao.EmployeeDaoImpl;
import com.cg.jdbc.emp.model.Employee;

/*@author smita*/
public class EmployeeServiceImpl implements IEmployeeService {
	private static EmployeeDao employeeDao;
	static{
		employeeDao= new EmployeeDaoImpl();
	}
	@Override
	public void addEmployee(Employee e) {
		employeeDao.addEmployee(e);
	}
	@Override
	public void removeEmployee(Employee e) {
		employeeDao.removeEmployee(e);
	}
	@Override
	public void modifyEmployee(Employee e) {
		employeeDao.modifyEmployee(e);
	}
	@Override
	public void searchEmployee(Employee e) {
		employeeDao.searchEmployee(e);
	}
	@Override
	public void listAllEmployee() {
		employeeDao.listAllEmployee();
	}
}
