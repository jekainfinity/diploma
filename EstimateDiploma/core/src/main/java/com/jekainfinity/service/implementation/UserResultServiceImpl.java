package com.jekainfinity.service.implementation;

import com.jekainfinity.hibernate.bean.RequestAnswer;
import com.jekainfinity.hibernate.dao.AnswerDao;
import com.jekainfinity.hibernate.dao.TaskDao;
import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.dao.UserResultDao;
import com.jekainfinity.hibernate.entity.*;
import com.jekainfinity.hibernate.entity.rootsUser.User;
import com.jekainfinity.hibernate.entity.userResult.UserResult;
import com.jekainfinity.hibernate.entity.tasks.TheoryTask;
import com.jekainfinity.hibernate.entity.userResult.UserResultForTheory;
import com.jekainfinity.service.UserResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service("userResultService")
public class UserResultServiceImpl implements UserResultService{
    @Autowired
    UserResultDao userResultDao;

    @Autowired
    TaskDao taskDao;

    @Autowired
    AnswerDao answerDao;

    @Autowired
    UserDao userDao;

    public void createUserResult(RequestAnswer requestAnswer, String username) {
        UserResultForTheory userResult = new UserResultForTheory();

        User user = userDao.findByUserName(username);
        TheoryTask theoryTask = taskDao.read(requestAnswer.getTheoryTaskId(), TheoryTask.class);
        List<UserAnswer> userAnswers = new ArrayList<UserAnswer>();
        int score=0;

        for (Integer answerId: requestAnswer.getAnswerIds()) {
            UserAnswer userAnswer = new UserAnswer();
            Answer answer = answerDao.read(answerId, Answer.class);

            userAnswer.setUserResult(userResult);
            userAnswer.setQuestionId(answer.getQuestion().getQuestionId());
            userAnswer.setAnswerId(answerId);

            if (answer.isStatusRight()){
                userAnswer.setStatus(true);
                score++;
            } else {
                userAnswer.setStatus(false);
            }

            userAnswers.add(userAnswer);
        }

        Set<UserResult> userResultsUser = user.getUserResults();
        Set<UserResult> userResultsTask = theoryTask.getUserResults();

        userResultsUser.add(userResult);
        userResultsTask.add(userResult);

        user.setUserResults(userResultsUser);
        theoryTask.setUserResults(userResultsTask);

        userResult.setScore(score);
        userResult.setUserAnswers(userAnswers);
        userResult.setUser(user);
        userResult.setAbstractTask(theoryTask);

        userResultDao.save(userResult);

    }

}

