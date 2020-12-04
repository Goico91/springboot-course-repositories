package com.course.springboot.repositories.repositories;

import com.course.springboot.repositories.vo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee, Integer> {

    Employee findEmployeeByNameAndSurname(String name, String surname);
}
