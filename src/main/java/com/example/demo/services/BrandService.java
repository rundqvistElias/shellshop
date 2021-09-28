package com.example.demo.services;

import com.example.demo.entities.Brand;
import com.example.demo.entities.Model;
import com.example.demo.repositories.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepo brandRepo;


    public List<Brand> getAll() {
        return brandRepo.findAll();


    }

    public List<Brand> findBrandById(long brandId) {
        return brandRepo.findById(brandId);
    }


    public Brand createBrand(Brand brand) {
        return brandRepo.save(brand);
    }

    public void deleteBrand(long id) {
        brandRepo.deleteById(id);
    }

    public void updateById(long id, Brand brand) {
        if (brandRepo.existsById(id)) {
            brand.setId(id);
            brandRepo.save(brand);
        }
    }
}
