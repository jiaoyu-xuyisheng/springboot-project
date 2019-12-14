package com.jiaoyu.mybatis.controller;


import com.jiaoyu.mybatis.bean.Department;
import com.jiaoyu.mybatis.bean.Employee;
import com.jiaoyu.mybatis.mapper.DepartmentMapper;
import com.jiaoyu.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }


    @RequestMapping("/dept")
    public Department insetDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }


}
