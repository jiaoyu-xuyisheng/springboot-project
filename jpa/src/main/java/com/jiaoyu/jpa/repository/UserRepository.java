package com.jiaoyu.jpa.repository;


import com.jiaoyu.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Integer> {
}
