package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.TaskDao;
import com.jekainfinity.hibernate.entity.BaseEntity;
import com.jekainfinity.hibernate.entity.TheoryTask;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository("taskDao")
public class TaskDaoImpl implements TaskDao{

    @Autowired
    SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
     public List<TheoryTask> getTaskTheoryList() {
         return (ArrayList<TheoryTask>) sessionFactory.getCurrentSession().createCriteria(TheoryTask.class).list();
     }

    public void save(TheoryTask object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    public TheoryTask read(int id, Class clazz) {
        return (TheoryTask) sessionFactory.getCurrentSession().get(clazz, id);
    }
}
