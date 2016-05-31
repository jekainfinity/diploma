package com.jekainfinity.hibernate.service.implementation;

import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.entity.rootsUser.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class UserDetailService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        com.jekainfinity.hibernate.entity.rootsUser.User user = userDao.findByUserName(username);
        Set<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());

        return buildUserForAuthentication(user, authorities);
    }

    private User buildUserForAuthentication(com.jekainfinity.hibernate.entity.rootsUser.User user, Set<GrantedAuthority> authorities) {
        return new User(user.getUsername(), user.getPassword(), true, true, true, true, authorities);
    }

    private Set<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        for (UserRole userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority(userRole.getRole().name()));
        }

        return setAuths;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
