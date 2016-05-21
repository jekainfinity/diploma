package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.PracticeTestDao;
import com.jekainfinity.hibernate.entity.BaseEntity;
import com.jekainfinity.hibernate.entity.tasks.PracticeTask;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("practiceTestDao")
public class PracticeTestDaoImpl implements PracticeTestDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(PracticeTask object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<PracticeTask> listPractice() {
        return sessionFactory.getCurrentSession().createCriteria(PracticeTask.class).list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
