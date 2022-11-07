package com.sunglowsys.controller;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.sevice.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class AddressResource {

    private final Logger logger = LoggerFactory.getLogger(AddressRepository.class);
    private final AddressService addressService;

    public AddressResource(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/addresses")
    public ResponseEntity<Address> create(@RequestBody Address address){
        logger.debug("Request to create address:{}",address);
        Address result = addressService.save(address);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PutMapping ("/addresses")
    public ResponseEntity<Address> update(@RequestBody Address address){
        logger.debug("Resquest to update address:{}", address);
        Address result = addressService.save(address);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/addresses")
    public  ResponseEntity<Page<Address>> findAll(Pageable pageable){
        logger.debug("Request to all address:{}", pageable);
        Page<Address> result = addressService.findAll(pageable);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/addresses/{id}")
    public ResponseEntity<Optional<Address>> findOne(@PathVariable Long id) {
        logger.debug("Request to findOne address:{}",id );
        Optional<Address> result = addressService.findOne(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @DeleteMapping("/addresses/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        logger.debug("Request to delete address:{}", id);
        addressService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }
}
