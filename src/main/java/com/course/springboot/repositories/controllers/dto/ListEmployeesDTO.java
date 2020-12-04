package com.course.springboot.repositories.controllers.dto;

import com.course.springboot.repositories.vo.Office;

import java.io.Serializable;

public class ListEmployeesDTO implements Serializable {
    private int idEmployee;

    private String name;

    private String surname;

    private Integer age;

    private Office office;

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
