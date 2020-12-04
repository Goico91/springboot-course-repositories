package com.course.springboot.repositories.repositories;

import com.course.springboot.repositories.vo.EmployeeKnowledge;
import com.course.springboot.repositories.vo.EmployeeKnowledgeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeKnowledgeRepository extends JpaRepository<EmployeeKnowledge, EmployeeKnowledgeKey> {

}
