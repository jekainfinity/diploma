package com.jekainfinity.hibernate.entity;

import com.jekainfinity.hibernate.entity.userResult.UserResult;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ANSWER")
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ANSWER_ID")
    private int id;

    @Column(name = "QUESTION_ID")
    private int questionId;

    @Column(name = "ANSWER_ID")
    private int answerId;

    @ManyToOne
    @JoinColumn(name = "USER_RESULT_ID")
    private UserResult userResult;

    @Column(name = "STATUS")
    boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public UserResult getUserResult() {
        return userResult;
    }

    public void setUserResult(UserResult userResult) {
        this.userResult = userResult;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
