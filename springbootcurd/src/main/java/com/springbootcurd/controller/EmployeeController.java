package com.springbootcurd.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcurd.module.Employee;
import com.springbootcurd.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/fetchAllEmployee", method=RequestMethod.GET)
	public List<Employee> getAllEmployess() {
		return employeeService.getAllEmployess();
	}

	@GetMapping("/fetchEmpByID/{id}")
	public Employee getEmployeeByID(@PathVariable Integer id) {
		return employeeService.getEmployeeByID(id);
	}
	
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmp(emp);
	}
	
	@PutMapping("/updateEmp")
	public List<Employee> updateEmployee(@RequestBody Employee emp, @PathParam(value = "empid") Integer empid) {
		return employeeService.update(emp,empid);
	}
	
	@DeleteMapping("/deleteEmp/{empid}")
	public String deleteEmp(@PathVariable Integer empid) {
		return employeeService.deleteEmp(empid);
	}
}
