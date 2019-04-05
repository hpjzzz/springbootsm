package cn.itsource.ssm.controller;

import cn.itsource.ssm.domain.Employee;
import cn.itsource.ssm.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping("/add")
    public void add(Employee employee){
        employeeService.add(employee);

    }

    @RequestMapping("/findOne")
    public Employee findOne(Long id){
        return employeeService.findOne(id);
    }
}
