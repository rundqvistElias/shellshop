package com.example.demo.repositories;

import com.example.demo.entities.Brand;
import com.example.demo.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepo extends JpaRepository<Model, Long> {

    List<Model> findById(long modelId);

    List<Model> findByBrandId(long brandId);

    List<Model> findByDimension(int dim);

}