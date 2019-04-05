package cn.itsource.ssm.service.impl;

import cn.itsource.ssm.domain.Employee;
import cn.itsource.ssm.mapper.EmployeeMapper;
import cn.itsource.ssm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Transactional
    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    @Override
    public Employee findOne(Long id) {
        return employeeMapper.findOne(id);
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
