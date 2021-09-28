package com.example.demo.controller;

import com.example.demo.entities.Brand;
import com.example.demo.entities.Model;
import com.example.demo.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brand")
    public List<Brand> getAllBrands(){ return brandService.getAll();}

    @PostMapping("/brand/add")
    public Brand createBrand(@RequestBody Brand brand) {return brandService.createBrand(brand);}
}
