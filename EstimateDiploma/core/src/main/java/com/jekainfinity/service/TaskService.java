package com.jekainfinity.service;

import com.jekainfinity.hibernate.bean.TheoryTaskBean;
import com.jekainfinity.hibernate.entity.TheoryTask;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {
    int saveTask(TheoryTaskBean theoryTaskBean);
    List<TheoryTask> getTheoryTaskList();
    TheoryTask readTheoryTask(int taskId);
}