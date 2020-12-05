package com.course.springboot.repositories.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer id;

    @NotNull
    @Column(name = "name", length = 50)
    @Size(max = 50)
    private String name;

    @NotNull
    @Column(name = "surname", length = 150)
    @Size(max = 150)
    private String surname;

    @Column(name = "password", length = 250)
    @Size(max = 250)
    private String password;

    @NotNull
    @Column(name = "age")
    private Integer age;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "employee_office")
    private Office office;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeKnowledge> employeeKnowledge;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<EmployeeKnowledge> getEmployeeKnowledge() {
        return employeeKnowledge;
    }

    public void setEmployeeKnowledge(List<EmployeeKnowledge> employeeKnowledge) {
        this.employeeKnowledge = employeeKnowledge;
    }
}
