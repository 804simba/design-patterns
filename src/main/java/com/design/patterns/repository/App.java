package com.design.patterns.repository;

public class App {

    /**
     * Repository design pattern is a design pattern that seperates the application's data access layer from
     * the business logic by providing a consistent interface for accessing data regardless of the data source
     *  used, allowing changes to the data source to be made without affecting the rest of the application.
     * */
    public static void main(String[] args) {
        Employee employee1 = Employee.builder()
                .id(1)
                .name("Simba")
                .age(26)
                .build();

        Employee employee2 = Employee.builder()
                .id(2)
                .name("Timtez")
                .age(25)
                .build();

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);

        System.out.println("employee with id 1 = " + employeeRepository.findByEmployeeById(1));
        System.out.println("employee list = " + employeeRepository.findAllEmployees());

        employeeRepository.delete(employee2);
        System.out.println("employee list = " + employeeRepository.findAllEmployees());

    }
}
