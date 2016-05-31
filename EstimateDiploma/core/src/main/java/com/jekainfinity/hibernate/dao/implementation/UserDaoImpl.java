package com.jekainfinity.hibernate.dao.implementation;

import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.entity.rootsUser.User;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public User findByUserName(String username) {

        List<User> users=  sessionFactory.getCurrentSession().createCriteria(User.class).add(Restrictions.eq("username",username)).list();
        if (users.size() > 0) {
            return  users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void save(User object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> list() {
        return (ArrayList<User>) sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
