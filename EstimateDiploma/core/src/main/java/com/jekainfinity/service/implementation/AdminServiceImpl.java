package com.jekainfinity.service.implementation;

import com.jekainfinity.hibernate.bean.TheoryTaskBean;
import com.jekainfinity.hibernate.dao.TaskDao;
import com.jekainfinity.hibernate.dao.implDao.AdminDaoImpl;
import com.jekainfinity.hibernate.entity.*;
import com.jekainfinity.service.AdminService;
import com.jekainfinity.utill.mappers.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
    @Autowired
    Mapper mapper;

    @Autowired
    AdminDaoImpl adminDao;

    @Autowired
    TaskDao taskDao;

    public TheoryTask readTask(int taskId){
        return (TheoryTask) adminDao.read(taskId, TheoryTask.class);
    }


}
