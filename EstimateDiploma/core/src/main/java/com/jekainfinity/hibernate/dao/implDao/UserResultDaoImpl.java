package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.UserResultDao;
import com.jekainfinity.hibernate.entity.UserResult;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userResultDao")
@Transactional
public class UserResultDaoImpl implements UserResultDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public void save(UserResult userResult) {
        sessionFactory.getCurrentSession().save(userResult);
    }
}
