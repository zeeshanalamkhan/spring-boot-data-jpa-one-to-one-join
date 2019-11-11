package com.zeeshan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeeshan.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
