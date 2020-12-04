package com.course.springboot.repositories.controllers.mappers;

import com.course.springboot.repositories.controllers.dto.EmployeeKnowledgeDTO;
import com.course.springboot.repositories.vo.EmployeeKnowledge;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeKnowledgeToEmployeeKnowledgeDTO {

    EmployeeKnowledge toEmployeeKnowledge(EmployeeKnowledgeDTO employeeKnowledgeDTO);

    EmployeeKnowledgeDTO toEmployeeKnowledgeDTO(EmployeeKnowledge employeeKnowledge);
}
