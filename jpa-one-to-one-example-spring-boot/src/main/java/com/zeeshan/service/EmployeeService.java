package com.zeeshan.service;

import java.util.List;

import com.zeeshan.dto.EmployeeAddress;
import com.zeeshan.model.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee emp);

	public Employee updateEmployee(Employee emp);

	public Employee getEmployee(Integer empId);

	public void deleteEmployee(Integer empId);

	public List<Employee> getAllEmployee();

	public EmployeeAddress getJoinData(Integer addressId);

}
