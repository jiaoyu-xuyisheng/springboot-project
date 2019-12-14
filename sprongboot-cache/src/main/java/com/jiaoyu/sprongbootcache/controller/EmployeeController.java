package com.jiaoyu.sprongbootcache.controller;


import com.jiaoyu.sprongbootcache.bean.Employee;
import com.jiaoyu.sprongbootcache.service.EmployeeService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        return employeeService.getEmpById(id);
    }

    @GetMapping("/emp")
    public Employee upDateEmp(Employee employee) {
        return employeeService.updateEmp(employee);
    }
}
