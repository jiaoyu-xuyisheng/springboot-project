package com.jiaoyu.sprongbootcache.service;

import com.jiaoyu.sprongbootcache.bean.Employee;
import com.jiaoyu.sprongbootcache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @CachePut(cacheNames = "emp", key = "#id")
    public Employee getEmpById(Integer id) {
        System.out.println("查询" + id + "号员工！");
        return employeeMapper.getEmpById(id);
    }

    ;


    @CachePut(value = "emp", key = "#employee.id")
    public Employee updateEmp(Employee employee) {
        System.out.println("UpDate" + employee.toString() + "号员工！");
        employeeMapper.updateEmp(employee);
        return employee;
    }

}
