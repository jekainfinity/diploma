package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.Answer;

public interface AnswerDao {
    Answer read(int id, Class clazz);
}
