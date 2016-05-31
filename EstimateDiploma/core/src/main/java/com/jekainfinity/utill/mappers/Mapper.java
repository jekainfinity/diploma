package com.jekainfinity.utill.mappers;

import com.jekainfinity.hibernate.bean.UserBean;
import com.jekainfinity.hibernate.entity.rootsUser.User;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public UserBean convertToUserBean(User user) {
        UserBean ub = new UserBean();
        ub.setUsername(user.getUsername());
        ub.setbDay(user.getbDay());
        ub.setPassword(user.getPassword());
        ub.setEmail(user.getEmail());
        ub.setLastName(user.getLastName());
        ub.setUserRoles(user.getUserRole());
        ub.setFirstname(user.getFirstname());
        return ub;
    }


    public User convertBeanToUser(UserBean userBean) {
        User u = new User();
        u.setUsername(userBean.getUsername());
        u.setbDay(userBean.getbDay());
        u.setPassword(userBean.getPassword());
        u.setEmail(userBean.getEmail());
        u.setLastName(userBean.getLastName());
        u.setUserRole(userBean.getUserRoles());
        u.setFirstname(userBean.getFirstname());
        return u;
    }
}
