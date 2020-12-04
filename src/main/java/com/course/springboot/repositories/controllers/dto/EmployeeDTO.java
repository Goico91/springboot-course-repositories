package com.course.springboot.repositories.controllers.dto;

import com.course.springboot.repositories.vo.Office;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

public class EmployeeDTO implements Serializable {

    @NotNull(message = "Name can not be null")
    private String name;

    @NotBlank(message = "Surname can not be null")
    private String surname;

    @NotBlank(message = "Password can not be null")
    private String password;

    @Min(value = 18, message = "Min age is 18 years")
    @Max(value = 100, message = "Max age is 100 years")
    private Integer age;

    @NotNull(message = "Office can not be null")
    private Office office;

    private List<EmployeeKnowledgeDTO> employeeKnowledge;

    public EmployeeDTO() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<EmployeeKnowledgeDTO> getEmployeeKnowledge() {
        return employeeKnowledge;
    }

    public void setEmployeeKnowledge(List<EmployeeKnowledgeDTO> employeeKnowledge) {
        this.employeeKnowledge = employeeKnowledge;
    }
}
