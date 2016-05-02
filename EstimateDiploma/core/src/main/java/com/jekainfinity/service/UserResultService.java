package com.jekainfinity.service;

import com.jekainfinity.hibernate.bean.RequestAnswer;

public interface UserResultService {
    void createUserResult(RequestAnswer requestAnswer, String username);
}
