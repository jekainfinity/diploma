package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.rootsUser.User;

import java.util.List;

public interface UserDao {
    User findByUserName(String username);
    void save(User object);
    List<User> list();
}
