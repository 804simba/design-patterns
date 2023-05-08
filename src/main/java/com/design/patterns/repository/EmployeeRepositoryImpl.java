package com.design.patterns.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final List<Employee> dataSource = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        dataSource.add(employee);
        return employee;
    }

    @Override
    public Optional<Employee> findByEmployeeById(Integer id) {
        return dataSource.stream()
                .filter(employee -> employee.getId().equals(id)).findFirst();
    }

    @Override
    public List<Employee> findAllEmployees() {
        return dataSource.stream().collect(Collectors.toList());
    }

    @Override
    public void delete(Employee employee) {
        dataSource.removeIf(e -> e == employee);
    }
}
