package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.tasks.PracticeTask;

import java.util.List;

public interface PracticeTestDao {
    void save(PracticeTask object);
    List<PracticeTask> listPractice();
}
