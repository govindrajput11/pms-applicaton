package com.sunglowsys.sevice;

import com.sunglowsys.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AddressService {

    Address save(Address address);

    Address update(Address address);

    Page<Address> findAll(Pageable pageable);

    Optional<Address> findOne(Long id);

    void delete(Long id);

}
