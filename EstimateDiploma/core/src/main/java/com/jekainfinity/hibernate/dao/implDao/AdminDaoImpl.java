package com.jekainfinity.hibernate.dao.implDao;

import com.jekainfinity.hibernate.dao.AdminDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {
}
