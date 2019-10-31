package com.springbootcurd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.springbootcurd.module.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> listEmp = new ArrayList<>();

	@Override
	public List<Employee> getAllEmployess() {
		return getData();
	}

	public List<Employee> getData() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Suresh");
		emp1.setSalary(10000f);
		emp1.setAddress("Vijayawaada");

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Suresh_2");
		emp2.setSalary(50000f);
		emp2.setAddress("Gunture");

		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Suresh_3");
		emp3.setSalary(40000f);
		emp3.setAddress("Hyd");

		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);

		return listEmp;
	}

	@Override
	public Employee getEmployeeByID(Integer id) {
		for (int i = 0; i < listEmp.size(); i++) {
			Employee emp = listEmp.get(i);
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public Employee saveEmp(Employee emp) {
		if (emp != null) {
			emp.setId( new Random().nextInt(20));
			listEmp.add(emp);
			return emp;
		}
		return null;
	}

	@Override
	public List<Employee> update(Employee emp, Integer id) {
		if(emp !=null && id !=null) {
			for(Employee emp2 : listEmp) {
				if(emp2.getId() == id) {
					emp2.setName(emp.getName());
					emp2.setSalary(emp.getSalary());
					emp2.setAddress(emp.getAddress());
				}
			}
		}
		return listEmp;
	}

	@Override
	public String deleteEmp(Integer id) {
		for(int i=0;i<listEmp.size();i++) {
			Employee emp = listEmp.get(i);
			if(emp.getId() == id) {
				listEmp.remove(i);
				return "Delete Successfully...";
			}
		}
		return "Unable to Delete...";
	}

}
