package com.example.customerprovincemanagerment.service.impl;

import com.example.customerprovincemanagerment.model.Customer;
import com.example.customerprovincemanagerment.repository.ICustomerRepo;
import com.example.customerprovincemanagerment.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepo iCustomerRepo;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepo.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepo.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }
}
