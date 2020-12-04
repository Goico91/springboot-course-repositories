package com.course.springboot.repositories.vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "office")
public class Office implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_office")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    public Office() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
