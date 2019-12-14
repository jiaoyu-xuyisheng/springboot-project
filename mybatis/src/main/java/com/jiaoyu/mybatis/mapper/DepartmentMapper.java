package com.jiaoyu.mybatis.mapper;


import com.jiaoyu.mybatis.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id =#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete  form department  where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id =#{id}")
    public int updateDept(Department department);
}
