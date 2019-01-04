package com.uwang.ssm.dao;

import com.uwang.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> findAll();
}
