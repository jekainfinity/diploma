package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.QuestionDao;
import com.jekainfinity.hibernate.entity.Question;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    @SuppressWarnings("unchecked")
    public List<Question> listByTask(int id, Class clazz) {
        return (ArrayList<Question>) sessionFactory.getCurrentSession().createCriteria(clazz).add(Restrictions.eq("theoryTask.taskId",id)).list();
    }
}
