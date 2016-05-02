package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.User;
import com.jekainfinity.hibernate.entity.enums.Roles;

import java.util.List;

public interface UserDao{
    User findByUserName(String username);
    void save(User object);
    List<User> list();
}
