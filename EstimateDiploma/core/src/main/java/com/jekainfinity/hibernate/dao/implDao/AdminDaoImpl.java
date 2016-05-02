package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.AdminDao;
import com.jekainfinity.hibernate.entity.TheoryTask;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {
}
