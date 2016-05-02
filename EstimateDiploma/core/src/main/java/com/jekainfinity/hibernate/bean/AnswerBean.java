package com.jekainfinity.hibernate.bean;

import com.jekainfinity.hibernate.entity.Question;

public class AnswerBean {

    private String answerText;
    private boolean statusRight;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isStatusRight() {
        return statusRight;
    }

    public void setStatusRight(boolean statusRight) {
        this.statusRight = statusRight;
    }
}
