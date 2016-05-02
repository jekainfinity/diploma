package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.entity.BaseEntity;
import com.jekainfinity.hibernate.dao.Crud;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public class CrudImpl implements Crud {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(BaseEntity object) {
        sessionFactory.getCurrentSession().save(object);
    }

    @Override
    public void update(BaseEntity object) {
        sessionFactory.getCurrentSession().update(object);
    }

    @Override
    public void delete(BaseEntity object) {
        sessionFactory.getCurrentSession().delete(object);
    }

    @Override
    public BaseEntity read(int id, Class clazz) {
        return (BaseEntity) sessionFactory.getCurrentSession().get(clazz, id);
    }

}
