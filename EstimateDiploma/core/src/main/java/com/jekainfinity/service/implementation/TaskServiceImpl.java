package com.jekainfinity.service.implementation;

import com.jekainfinity.hibernate.bean.TheoryTaskBean;
import com.jekainfinity.hibernate.dao.TaskDao;
import com.jekainfinity.hibernate.entity.tasks.TheoryTask;
import com.jekainfinity.service.TaskService;
import com.jekainfinity.utill.mappers.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("taskService")
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskDao taskDao;

    @Autowired
    Mapper mapper;

    @Override
    public int saveTask(TheoryTaskBean theoryTaskBean) {
        TheoryTask theoryTask = mapper.converToTheoryTaskObject(theoryTaskBean);
        taskDao.save(theoryTask);

        return theoryTask.getTaskId();
    }

    @Override
    public TheoryTask readTheoryTask(int taskId) {
        return taskDao.read(taskId, TheoryTask.class);
    }

    public List<TheoryTask> getTheoryTaskList() {
        return taskDao.getTaskTheoryList();
    }
}
