package com.zeeshan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zeeshan.dto.EmployeeAddress;
import com.zeeshan.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "SELECT new com.zeeshan.dto.EmployeeAddress(e.employeeName, e.employeeCode, e.designation, a.doorNumber, a.street, a.city) FROM "
			+ "Employee e JOIN e.address a where a.id = :aId")
	public EmployeeAddress getJoinData(@Param("aId") Integer aId);
	
}
