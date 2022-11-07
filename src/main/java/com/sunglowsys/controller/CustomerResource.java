package com.sunglowsys.controller;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.sevice.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/api")
public class CustomerResource {

    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/customers")
    public  ResponseEntity<Customer> create(@RequestBody  Customer customer){
        Customer result = customerService.save(customer);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }

    @PutMapping("/customers")
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        Customer result = customerService.save(customer);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Optional<Customer>> findById(@PathVariable Long id){
        Optional<Customer> result = customerService.findById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }

    @GetMapping("/customers")
    public ResponseEntity<Page<Customer>> findAll(Pageable pageable){
        Page<Customer> result = customerService.findAll(pageable);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }
    @DeleteMapping("customers/{id}")
    public ResponseEntity<Customer> delete(@PathVariable Long id){
        customerService.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }


}
