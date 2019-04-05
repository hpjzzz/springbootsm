package cn.itsource.ssm.service;

import cn.itsource.ssm.domain.Employee;

import java.util.List;

public interface IEmployeeService {

    void add(Employee employee);
    Employee findOne(Long id);
    List<Employee> findAll();
}
