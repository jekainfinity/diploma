package com.jekainfinity.hibernate.service.implementation;

import com.jekainfinity.hibernate.bean.UserBean;
import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.entity.rootsUser.User;
import com.jekainfinity.hibernate.entity.rootsUser.UserRole;

import com.jekainfinity.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void addUserToDatabase(UserBean userBean) {

    }

    @Override
    public Set<UserRole> getRoleByName(String username) {
        return userDao.findByUserName(username).getUserRole();
    }

    @Override
    public List<User> getUserList() {
        return null;
    }
}
