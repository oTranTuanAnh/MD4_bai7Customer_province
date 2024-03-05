package com.example.customerprovincemanagerment.repository;

import com.example.customerprovincemanagerment.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Long> {
}
