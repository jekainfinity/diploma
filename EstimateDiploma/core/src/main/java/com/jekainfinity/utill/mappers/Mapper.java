package com.jekainfinity.utill.mappers;

import com.jekainfinity.hibernate.bean.*;
import com.jekainfinity.hibernate.entity.Answer;
import com.jekainfinity.hibernate.entity.Question;
import com.jekainfinity.hibernate.entity.TheoryTask;
import com.jekainfinity.hibernate.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Mapper {
    public UserBean convertToUserBean(User user) {
        UserBean ub = new UserBean();
        ub.setUsername(user.getUsername());
        ub.setbDay(user.getbDay());
        ub.setPassword(user.getPassword());
        ub.setEmail(user.getEmail());
        ub.setLastName(user.getLastName());
        ub.setUserRoles(user.getUserRole());
        ub.setFirstname(user.getFirstname());
        return ub;
    }

    public TheoryTask converToTheoryTaskObject(TheoryTaskBean theoryTaskBean) {
        TheoryTask theoryTask = new TheoryTask();
        theoryTask.setTaskName(theoryTaskBean.getTaskName());
        theoryTask.setQuestions(theoryTaskBean.getQuestions());
        theoryTask.setCourse(theoryTaskBean.getCourse());
        theoryTask.setTaskDescription(theoryTaskBean.getTaskDescription());
        theoryTask.setTheoryTaskLevel(theoryTaskBean.getTheoryTaskLevel());

        return theoryTask;
    }

    public TheoryTaskBean convertTheoryTaskToBean(TheoryTask theoryTask) {
        TheoryTaskBean theoryTaskBean = new TheoryTaskBean();
        theoryTaskBean.setTaskName(theoryTask.getTaskName());
        theoryTaskBean.setQuestions(theoryTask.getQuestions());
        theoryTaskBean.setCourse(theoryTask.getCourse());
        theoryTaskBean.setTaskDescription(theoryTask.getTaskDescription());
        theoryTaskBean.setTheoryTaskLevel(theoryTask.getTheoryTaskLevel());
        return theoryTaskBean;
    }

    public User convertBeanToUser(UserBean userBean) {
        User u = new User();
        u.setUsername(userBean.getUsername());
        u.setbDay(userBean.getbDay());
        u.setPassword(userBean.getPassword());
        u.setEmail(userBean.getEmail());
        u.setLastName(userBean.getLastName());
        u.setUserRole(userBean.getUserRoles());
        u.setFirstname(userBean.getFirstname());
        return u;
    }

    public Question convertToQuestionObj(QuestionBean questionBean) {
        Question question = new Question();
        question.setQuestionText(questionBean.getQuestionText());
        return question;
    }

    public Answer convertAnswerBeanToAnswer(AnswerBean answerBean, Question question) {
        Answer answer = new Answer();
        answer.setAnswerText(answerBean.getAnswerText());
        answer.setStatusRight(answerBean.isStatusRight());
        answer.setQuestion(question);
        return answer;
    }




}
