package com.fiap.techchallenge.address.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.techchallenge.address.domain.Address;
import com.fiap.techchallenge.address.gateway.AddressRepositoryGateway;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressUseCase {

	@Autowired
	private AddressRepositoryGateway addressRepository;
	
	public Long create(Address address) {
		log.trace("Start address={}", address);
		
		Long addressId = addressRepository.create(address);
		
		log.trace("End addressId={}", addressId);
		return addressId;
	}
}
