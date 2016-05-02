package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.AnswerDao;
import com.jekainfinity.hibernate.entity.Answer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("answerDao")
@Transactional
public class AnswerDaoImpl implements AnswerDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Answer read(int id, Class clazz) {
        return (Answer) sessionFactory.getCurrentSession().get(clazz,id);
    }
}
