package com.courseBookingSystem.courseBookingSystem.controllers;

import com.courseBookingSystem.courseBookingSystem.models.Customer;
import com.courseBookingSystem.courseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
            @RequestParam(required = false, name = "courseName") String courseName,
            @RequestParam(required = false, name = "townName") String townName
    ) { if (townName != null && courseName != null){
        return new ResponseEntity<>(customerRepository.findCustomersByHometownAndBookingsCourseName(townName, courseName), HttpStatus.OK);
    }
        if (courseName != null)
        {
            return new ResponseEntity<>(customerRepository.findCustomersByBookingsCourseName(courseName), HttpStatus.OK);
        }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity(customerRepository.findById(id), HttpStatus.OK);
    }

}
