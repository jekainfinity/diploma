package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.QuestionDao;
import com.jekainfinity.hibernate.entity.Question;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("uestionDao")
@Transactional
public class QuestionDaoImpl implements QuestionDao {

    @Autowired
    SessionFactory sessionFactory;

    public void save(Question object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    public Question read(int id, Class clazz) {
        return (Question) sessionFactory.getCurrentSession().get(clazz, id);
    }
}
