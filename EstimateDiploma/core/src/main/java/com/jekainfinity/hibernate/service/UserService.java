package com.jekainfinity.hibernate.service;

import com.jekainfinity.hibernate.bean.UserBean;
import com.jekainfinity.hibernate.entity.rootsUser.User;
import com.jekainfinity.hibernate.entity.rootsUser.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {
    void addUserToDatabase(UserBean userBean);
    Set<UserRole> getRoleByName(String username);
    List<User> getUserList();
}
