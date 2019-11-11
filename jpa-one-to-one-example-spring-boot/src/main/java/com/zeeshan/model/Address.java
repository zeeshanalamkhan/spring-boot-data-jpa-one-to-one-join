package com.zeeshan.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(initialValue = 101, name = "address_seq", sequenceName = "address_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
	private Integer id;
	private String doorNumber;
	private String street;
	private String city;

}
