package com.zeeshan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeeshan.dto.EmployeeAddress;
import com.zeeshan.model.Employee;
import com.zeeshan.repository.AddressRepository;
import com.zeeshan.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee emp) {
		employeeRepository.save(emp);
		return getEmployee(emp.getId());
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee emp1 = getEmployee(emp.getId());
		emp1.setId(emp.getId());
		emp1.setEmployeeName(emp.getEmployeeName());
		emp1.setEmployeeCode(emp.getEmployeeCode());
		emp1.setDesignation(emp.getDesignation());
		emp1.setAddress(emp.getAddress());
		return createEmployee(emp1);
	}

	@Override
	public Employee getEmployee(Integer empId) {

		return employeeRepository.findById(empId).get();

	}

	@Override
	public void deleteEmployee(Integer empId) {

		employeeRepository.deleteById(empId);

	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public EmployeeAddress getJoinData(Integer addressId) {

		return employeeRepository.getJoinData(addressId);
	}

}
