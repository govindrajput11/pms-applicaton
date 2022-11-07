package com.sunglowsys.sevice.impl;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.sevice.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class AddressServiceImpl implements AddressService {

    private final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

     private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address save(Address address) {
        logger.debug("REST request to save the address:{}",address);
        return addressRepository.save(address);
    }

    @Override
    public Address update(Address address) {
        logger.debug("Rest request to update the address:{}",address);
        return addressRepository.save(address);
    }

    @Override
    public Page<Address> findAll(Pageable pageable) {
        logger.debug("Request to find address:{}",pageable);
        return addressRepository.findAll(PageRequest.of(0,5));
    }

    @Override
    public Optional<Address> findOne(Long id) {
        logger.debug("request to  find one address:{}",id);
        return addressRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("Request to delete object address:{}",id);
        addressRepository.deleteById(id);

    }
}
