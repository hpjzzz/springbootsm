package cn.itsource.ssm.mapper;

import cn.itsource.ssm.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    void add(Employee employee);
    Employee findOne(Long id);
    List<Employee> findAll();
}
