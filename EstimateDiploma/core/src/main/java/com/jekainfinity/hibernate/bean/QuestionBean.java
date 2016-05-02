package com.jekainfinity.hibernate.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuestionBean  implements Serializable{
    private String questionText;
    private List<AnswerBean> answers = new ArrayList<AnswerBean>();

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<AnswerBean> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerBean> answers) {
        this.answers = answers;
    }
}
