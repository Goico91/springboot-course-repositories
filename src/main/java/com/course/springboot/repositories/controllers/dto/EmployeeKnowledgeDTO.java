package com.course.springboot.repositories.controllers.dto;

import java.io.Serializable;

public class EmployeeKnowledgeDTO implements Serializable {

    private KnowledgeDTO knowledge;

    private Integer yearsExperience;

    private String level;

    public EmployeeKnowledgeDTO() {
    }

    public KnowledgeDTO getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(KnowledgeDTO knowledge) {
        this.knowledge = knowledge;
    }

    public Integer getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Integer yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
