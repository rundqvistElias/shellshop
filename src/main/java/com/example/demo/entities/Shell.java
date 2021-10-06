package com.example.demo.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="shell")

public class Shell {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String color;
    private String info;
    private int dimension;


    public Shell() {
    }

    public Shell(long id, String name, String color, String info, int dimension) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.info = info;
        this.dimension = dimension;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }


    @Override
    public String toString() {
        return "Shell{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", info='" + info + '\'' +
                ", dimension=" + dimension +
               + '\'' +
                '}';
    }

}
