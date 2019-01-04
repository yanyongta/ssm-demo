package com.uwang.ssm.service.impl;

import com.uwang.ssm.dao.UserDao;
import com.uwang.ssm.model.User;
import com.uwang.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
