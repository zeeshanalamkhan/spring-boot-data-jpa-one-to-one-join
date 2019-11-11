package com.zeeshan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeAddress {

	private String employeeName;
	private String employeeCode;
	private String designation;

	private String doorNumber;
	private String street;
	private String city;

}
