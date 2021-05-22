package com.vratant.movieauth.service;

import com.vratant.movieauth.dao.CustomerRepository;
import com.vratant.movieauth.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    Optional<Customer> optionalStudent;

    @Autowired
    Customer customer;

    @Override
    public void deleteById(int id){
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        optionalStudent = customerRepository.findById(id);
        if(optionalStudent.isPresent()){
            customer = optionalStudent.get();
            return customer;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Customer> findAll() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    @Override
    public void save(Customer student) {
        customerRepository.save(student);

    }


}
