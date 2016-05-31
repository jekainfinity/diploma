package com.jekainfinity.hibernate.bean;

import com.jekainfinity.hibernate.entity.rootsUser.UserRole;

import java.util.Date;
import java.util.Set;

public class UserBean {
    private String username;
    private String firstname;
    private String lastName;
    private String password;
    private String email;
    private Date bDay;
    private boolean enabled;
    private Set<UserRole> userRoles;

    public UserBean(){

    }

    public UserBean(String username, String firstname, String lastName, String password,
                    String email, Date bDay) {
        this.username = username;
        this.firstname = firstname;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.bDay = bDay;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
