package com.example.demo.repositories;

import com.example.demo.entities.Brand;
import com.example.demo.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {

    List<Brand> findById(long brandId);

}
