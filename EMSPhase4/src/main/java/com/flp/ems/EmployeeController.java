package com.flp.ems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.flp.ems.model.emp.Employee;
import com.flp.ems.services.EmployeeServices;
import com.flp.ems.services.impl.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeServices;	

	public void setEmployeeServices(EmployeeServiceImpl employeeServices) {
		this.employeeServices = employeeServices;
	}

	@RequestMapping("form")
	public ModelAndView getForm(@ModelAttribute Employee employee) {
		return new ModelAndView("form");
	}
	
	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute Employee employee) {
		employeeServices.addEmployee(employee);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("list")
	public ModelAndView getList() {
		@SuppressWarnings("rawtypes")
		List employeeList = employeeServices.getAllEmployee();
		return new ModelAndView("list","employeeList",employeeList);
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		
		employeeServices.removeEmployee(employeeServices.searchEmployee(id));;
		return new ModelAndView("redirect:list");
	}
	
	
	
	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute Employee employee) {
		employeeServices.modifyEmployee(employee);
		return new ModelAndView("redirect:list");
	}
}

