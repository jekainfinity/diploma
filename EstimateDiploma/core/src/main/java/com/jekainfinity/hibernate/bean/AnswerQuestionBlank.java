package com.jekainfinity.hibernate.bean;

import com.jekainfinity.hibernate.entity.Answer;
import com.jekainfinity.hibernate.entity.Question;

import java.util.ArrayList;
import java.util.List;

public class AnswerQuestionBlank {
    private QuestionBean question;
    private List<AnswerBean> answer = new ArrayList<AnswerBean>();

    public QuestionBean getQuestion() {
        return question;
    }

    public void setQuestion(QuestionBean question) {
        this.question = question;
    }

    public List<AnswerBean> getAnswer() {
        return answer;
    }

    public void setAnswer(List<AnswerBean> answer) {
        this.answer = answer;
    }
}
