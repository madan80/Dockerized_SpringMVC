package de.init.demo;

import java.util.List;

public interface EmployeeDAO
{
    void saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    List<Employee> getAllEmployees();
}