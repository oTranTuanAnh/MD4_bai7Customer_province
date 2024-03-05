package com.example.customerprovincemanagerment.repository;

import com.example.customerprovincemanagerment.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends PagingAndSortingRepository<Customer, Long> {
    Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name);
}
