package com.course.springboot.repositories.vo;

import javax.persistence.*;

@Entity
@Table(name = "employee_knowledge")
public class EmployeeKnowledge {

    @EmbeddedId
    private EmployeeKnowledgeKey id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @ManyToOne
    @MapsId("knowledgeId")
    @JoinColumn(name = "id_knowledge")
    private Knowledge knowledge;

    @Column(name = "years_experience")
    private int yearsExperience;

    @Column(name = "level", length = 150)
    private String level;

    public EmployeeKnowledge() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeKnowledgeKey getId() {
        return id;
    }

    public void setId(EmployeeKnowledgeKey id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
