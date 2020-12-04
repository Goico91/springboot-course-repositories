package com.course.springboot.repositories.controllers.dto;

public class KnowledgeDTO {
    private Integer id;

    private String name;

    public KnowledgeDTO() {
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
}
