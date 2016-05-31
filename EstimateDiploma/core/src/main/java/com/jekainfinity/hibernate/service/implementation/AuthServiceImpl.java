package com.jekainfinity.hibernate.service.implementation;

import com.jekainfinity.hibernate.bean.UserBean;
import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.entity.enums.Roles;
import com.jekainfinity.hibernate.entity.rootsUser.User;
import com.jekainfinity.hibernate.entity.rootsUser.UserRole;
import com.jekainfinity.hibernate.service.AuthService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("authService")
public class AuthServiceImpl implements AuthService
{
    @Autowired
    UserDao userDao;

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void registerUser(UserBean userBean) {
        User user  = new User();
        UserRole userRole = new UserRole();
        Set<UserRole> userRoles = new HashSet<>();

        userRole.setRole(Roles.ROLE_USER);
        userRole.setUser(user);
        userRoles.add(userRole);

        user.setUsername(userBean.getUsername());
        user.setFirstname(userBean.getFirstname());
        user.setLastName(userBean.getLastName());
        user.setPassword(userBean.getPassword());
        user.setEmail(userBean.getEmail());
        user.setbDay(userBean.getbDay());
        user.setEnabled(true);
        user.setUserRole(userRoles);

        System.out.println(user.getFirstname() + " " + user.getLastName() + " " + user.getbDay() );

        userDao.save(user);
    }
}
