package com.example.customerprovincemanagerment.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGenerateService<T> {
    Page<T> findAll(Pageable pageable);

    void save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
