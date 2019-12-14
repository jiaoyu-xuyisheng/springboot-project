package com.jiaoyu.mybatis.mapper;

import com.jiaoyu.mybatis.bean.Employee;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
