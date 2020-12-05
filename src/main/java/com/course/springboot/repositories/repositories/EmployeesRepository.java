package com.course.springboot.repositories.repositories;

import com.course.springboot.repositories.vo.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeesRepository extends JpaRepository<Employee, Integer> {

    Employee findEmployeeByNameAndSurname(String name, String surname);

    @Query("select employee from Employee employee where (:name is null or employee.name = :name) and" +
            "(:surname is null or employee.surname = :surname) and (:office is null or employee.office.id = :office)")
    Page<Employee> findEmployeesByFilter(String name, String surname, Integer office, Pageable pageable);
}
