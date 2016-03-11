/**
 * 
 */
package com.cg.jdbc.emp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import com.cg.connection.MyConnection;
import com.cg.jdbc.emp.model.Employee;
/*@author smita*/
public class EmployeeDaoImpl implements EmployeeDao {
	static ArrayList<Employee> empList;
	Connection con=null;
	PreparedStatement ps =null;
	Statement stmt=null;
	ResultSet rs =null;
	
	//init block
	{
		con=MyConnection.getConnection();
	}
	static{
		empList=new ArrayList<Employee>();
	}
	@Override
	public void addEmployee(Employee e) {
		empList.add(e);
		if(empList.contains(e)){
//checking whether employee got removed form the list or not
			System.out.println("Employee added succefully!");
		}else{
			System.out.println("Employee not added!");
		}
	}
	@Override
	public void removeEmployee(Employee e) {
		empList.remove(e);
		if(empList.contains(e)){
//checking whether employee got removed form the list or not
			System.out.println("Employee not removed!");
		}else{
			System.out.println("Employee removes succefully!");
		}
	}
	@Override
	public void modifyEmployee(Employee e) {
//checking whethre Employee exists or not
		if(empList.contains(e)){
//if exists then getting the index of that object for updation		
		int index= empList.indexOf(e);	
//calling the setter method of the list and setting new object 
		//on the index of old object
		empList.set(index, e);
		}
		else{
			System.out.println("Employee does Not exists");
		}
	}
	@Override
	public void searchEmployee(Employee e) {
		if(empList.contains(e))
			System.out.println("Employee Found :"+e);
		else
			System.out.println("Employee Not Found");
	}
	@Override
	public void listAllEmployee() {
		System.out.println("==========List Of Employees=========");
		Iterator<Employee> iter = empList.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	public int insert(Employee e){
		int no_of_record=0;
	//ps.setInt(1,e.getEmpId());
		return no_of_record;
	}
	public int update(Employee e){
		int no_of_record=0;
		//double ephone= e.getPhoneNo();
		String updateQuery="update emp set PhoneNo=ephone";
		return no_of_record;
	}
	public int delete(Employee e){
		int no_of_record=0;
		int eid= e.getEmpId();
		String deleteQuery="delet from emp where empId=eid";
		return no_of_record;
	}
	public void select(){
		
	}
	public Employee search(int empId){
		Employee e1=null;
		return e1;
	}
}
