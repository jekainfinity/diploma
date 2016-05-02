package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.Question;

import java.util.List;

/**
 * Created by opensoul on 30.04.16.
 */
public interface QuestionDao {
    void save(Question object);
    Question read(int id, Class clazz);
    List listByTask(int id, Class clazz);
}
