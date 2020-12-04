package com.course.springboot.repositories.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "knowledge")
public class Knowledge implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_knowledge")
    private int id;

    @Column(name = "name", length = 250)
    @NotNull
    private String name;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeKnowledge> employeeKnowledge;

    public Knowledge() {
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

    public List<EmployeeKnowledge> getEmployeeKnowledge() {
        return employeeKnowledge;
    }

    public void setEmployeeKnowledge(List<EmployeeKnowledge> employeeKnowledge) {
        this.employeeKnowledge = employeeKnowledge;
    }
}
