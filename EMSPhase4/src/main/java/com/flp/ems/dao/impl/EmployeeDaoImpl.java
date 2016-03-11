package com.flp.ems.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flp.ems.dao.EmployeeDao;
import com.flp.ems.model.emp.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	private SessionFactory sessionFactory;
	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Transactional
	public int addEmployee(Employee employee) {
		Serializable id =0;
		try{
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(employee);
			tx.commit();
			id = session.getIdentifier(employee);
			session.close();
			return (Integer) id;
		
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("getClass : "+ex.getClass());
		}
		return (Integer) id;
		
	}//end of addEmployee
	//start of modifyEmployee
	
	public int modifyEmployee(Employee employee) {		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();
		if(employee!=null){
			return 1;
		}else
			return 0;
	}//end of modifyEmployee
	//start of remove Employee

	public int removeEmployee(Employee employee) {		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
		Employee e=searchEmployee(employee.getEmpId());
		if(e!=null){
			return 1;
		}
		else
			return 0;
		
	}//end of remove Employee
	//start of getAllEmployees
	
	public ArrayList<Employee> getAllEmployee() {
		

		
		Session session=sessionFactory.openSession();
		List<Employee> employees=session.createQuery("from Employee").list();
		session.close();
		return (ArrayList<Employee>) employees;
	}
	//end of getAllEmployees
	//searching employee by employeeId

	public Employee searchEmployee(int empId) {
		

		
		Session session=sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class,empId);
		session.close();
		System.out.println(employee);
		return employee;
		
	}// end of searchEmployee(by empId)
	//start of searchEmployeeByKinId

	public Employee searchEmployeeByKinId(String kinId) {
		
		Session session=sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class,kinId);
		session.close();
		System.out.println(employee);
		return employee;
	}

	@Override
	public Employee searchEmployeeByName(String empName) {

		Session session=sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class,empName);
		session.close();
		System.out.println(employee);
		return employee;		
	}

	@Override
	public Employee searchEmployeeByEmail(String emailId) {
		Session session=sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class,emailId);
		session.close();
		System.out.println(employee);
		return employee;
	}
}// end of class
