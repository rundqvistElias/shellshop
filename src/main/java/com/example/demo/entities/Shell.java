package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="shell")

public class Shell {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private long id;
    private String name;
    private String color;
    private String info;
    private int dimension;

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


    public Shell() {
    }



    public Shell(long id, String name, String color, String info) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Shell{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
