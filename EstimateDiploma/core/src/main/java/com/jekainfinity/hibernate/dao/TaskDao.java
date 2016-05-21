package com.jekainfinity.hibernate.dao;

import com.jekainfinity.hibernate.entity.tasks.TheoryTask;
import java.util.List;

public interface TaskDao{
    List<TheoryTask> getTaskTheoryList();
    void save(TheoryTask object);
    TheoryTask read(int id, Class clazz);
}
