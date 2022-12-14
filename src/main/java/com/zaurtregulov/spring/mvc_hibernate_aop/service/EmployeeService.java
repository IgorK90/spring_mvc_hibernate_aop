package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void SaveEmployee(Employee employee);
    public Employee getEmployee(int id);

    public void DeleteEmployee(Employee employee);
    public void DeleteEmployee(int id);

}
