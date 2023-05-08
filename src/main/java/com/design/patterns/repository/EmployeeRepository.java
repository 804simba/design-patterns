package com.design.patterns.repository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Optional<Employee> findByEmployeeById(Integer id);
    List<Employee> findAllEmployees();
    void delete(Employee employee);
}
