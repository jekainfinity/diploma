package com.jekainfinity.service;

import com.jekainfinity.hibernate.bean.QuestionBean;
import com.jekainfinity.hibernate.entity.Question;

/**
 * Created by opensoul on 30.04.16.
 */
public interface QuestionService {
    int saveQuestion(QuestionBean questionBean, int theoryTaskId);
    Question read(int id, Class clazz);
}