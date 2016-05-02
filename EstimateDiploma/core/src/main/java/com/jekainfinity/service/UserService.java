package com.jekainfinity.service;

import com.jekainfinity.hibernate.bean.UserBean;
import com.jekainfinity.hibernate.entity.User;
import com.jekainfinity.hibernate.entity.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {
    void addUserToDatabase(UserBean userBean);
    Set<UserRole> getRoleByName(String username);
    List<User> getUserList();
}
