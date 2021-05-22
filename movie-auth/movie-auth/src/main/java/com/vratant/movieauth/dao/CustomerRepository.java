package com.vratant.movieauth.dao;

import com.vratant.movieauth.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
