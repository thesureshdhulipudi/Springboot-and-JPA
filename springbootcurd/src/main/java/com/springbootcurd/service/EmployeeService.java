package com.springbootcurd.service;

import java.util.List;

import com.springbootcurd.module.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployess();

	Employee getEmployeeByID(Integer id);

	Employee saveEmp(Employee emp);

	List<Employee> update(Employee emp, Integer id);

	String deleteEmp(Integer id);
}
