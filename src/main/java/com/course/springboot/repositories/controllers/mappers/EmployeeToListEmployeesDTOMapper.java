package com.course.springboot.repositories.controllers.mappers;

import com.course.springboot.repositories.controllers.dto.ListEmployeesDTO;
import com.course.springboot.repositories.vo.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeToListEmployeesDTOMapper {

    EmployeeToListEmployeesDTOMapper INSTANCE = Mappers.getMapper(EmployeeToListEmployeesDTOMapper.class);

    @Mapping( target = "idEmployee", source = "id")
    ListEmployeesDTO employeeToListEmployeeDTO(Employee employee);

    List<ListEmployeesDTO> employeeToListEmployeesDTO(List<Employee> employee);
}
