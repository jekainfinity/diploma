package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.BaseEntity;

public interface Crud {
    void save(BaseEntity object);
    void update(BaseEntity object);
    void delete(BaseEntity object);
    BaseEntity read(int id, Class clazz);

}
