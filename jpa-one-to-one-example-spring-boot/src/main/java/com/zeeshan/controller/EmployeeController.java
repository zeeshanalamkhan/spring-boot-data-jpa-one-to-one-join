package com.zeeshan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.dto.EmployeeAddress;
import com.zeeshan.model.Employee;
import com.zeeshan.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;

	@PostMapping(consumes = "application/json", produces = "application/json", path = "/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
		return new ResponseEntity<>(employeeService.createEmployee(emp), HttpStatus.CREATED);

	}

	@GetMapping(path = "/employee/{empId}", produces = "application/json")
	public ResponseEntity<Employee> getEmployee(@PathVariable(value = "empId") Integer empId) {
		return new ResponseEntity<>(employeeService.getEmployee(empId), HttpStatus.OK);
	}

	@GetMapping(path = "/employeeJoin/{addressId}", produces = "application/json")
	public ResponseEntity<EmployeeAddress> getEmployeeJoin(@PathVariable(value = "addressId") Integer addressId) {
		return new ResponseEntity<>(employeeService.getJoinData(addressId), HttpStatus.OK);
	}

	@GetMapping(path = "/employee", produces = "application/json")
	public ResponseEntity<List<Employee>> listAllEmployee() {
		return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
	}

	@PutMapping(path = "/employee", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
		return new ResponseEntity<>(employeeService.updateEmployee(emp), HttpStatus.CREATED);
	}

	@DeleteMapping(path = "/employee/{empId}", produces = "application/json", consumes = "text/plain")
	public ResponseEntity<String> deleteEmployee(@PathVariable(value="empId") Integer empId) {
		employeeService.deleteEmployee(empId);
		return new ResponseEntity<>("Employee with EmployeeId : " + empId + " deleted successfully", HttpStatus.NO_CONTENT);
	}
}
