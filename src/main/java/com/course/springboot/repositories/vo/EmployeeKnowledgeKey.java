package com.course.springboot.repositories.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmployeeKnowledgeKey implements Serializable {

    @Column(name = "id_employee")
    private Integer employeeId;

    @Column(name = "id_office")
    private Integer knowledgeId;

    public EmployeeKnowledgeKey() {
    }

    public EmployeeKnowledgeKey(Integer employeeId, Integer knowledgeId) {
        this.employeeId = employeeId;
        this.knowledgeId = knowledgeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }
}
