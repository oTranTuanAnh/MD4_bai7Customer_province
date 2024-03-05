package com.example.customerprovincemanagerment.service.impl;

import com.example.customerprovincemanagerment.model.Province;
import com.example.customerprovincemanagerment.repository.IProvinceRepo;
import com.example.customerprovincemanagerment.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepo iProvinceRepo;
    @Override
    public Iterable<Province> findAll() {
        return iProvinceRepo.findAll();
    }

    @Override
    public void save(Province province) {
        iProvinceRepo.save(province);
    }

    @Override
    public Optional<Province> findById(Long id) {
        return iProvinceRepo.findById(id);
    }

    @Override
    public void remove(Long id) {
        iProvinceRepo.deleteById(id);
    }
}
