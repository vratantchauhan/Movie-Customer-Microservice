package com.vratant.movieauth.service;

import com.vratant.movieauth.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CustomerService {

    public void deleteById(int id);

    Customer findById(int id);

    ArrayList<Customer> findAll();

    void save(Customer customer);
}
