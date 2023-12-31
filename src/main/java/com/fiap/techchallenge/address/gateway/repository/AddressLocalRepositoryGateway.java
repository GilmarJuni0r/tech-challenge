package com.fiap.techchallenge.address.gateway.repository;

import com.fiap.techchallenge.address.domain.Address;
import com.fiap.techchallenge.address.gateway.AddressRepositoryGateway;
import com.fiap.techchallenge.address.gateway.exception.ErrorToAccessDatabaseException;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Repository
public class AddressLocalRepositoryGateway implements AddressRepositoryGateway {
	private Long sequenceId = 1L;
	
    private Set<Address> adresses;

    public AddressLocalRepositoryGateway() {
        adresses = new HashSet<>();
    }

	@Override
	public Long create(Address address) {		
		try {
			log.trace("Start address={}", address);
			address.setId(sequenceId++);
			
			adresses.add(address);		
			Long addressId = address.getId();
			
			log.trace("End addressId={}", addressId);
			return addressId;
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new ErrorToAccessDatabaseException();
		}
	}
}
