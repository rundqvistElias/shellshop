package com.example.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String info;
    private int dimension;


    @ManyToOne
    private Brand brand;


    public Model() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDimension() {
        return info;
    }

    public void setDimension(String info) {
        this.info = info;
    }

    public Model(long id, String name, String info, int dimension) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.dimension = dimension;
    }
    @JsonIgnore
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", dimension=" + dimension +
                ", brand=" + brand +
                '}';
    }

}
