package com.jekainfinity.hibernate.bean;

import java.util.ArrayList;
import java.util.List;

public class RequestAnswer {
    private int theoryTaskId;
    private List<Integer> answerIds = new ArrayList<>();

    public int getTheoryTaskId() {
        return theoryTaskId;
    }

    public void setTheoryTaskId(int theoryTaskId) {
        this.theoryTaskId = theoryTaskId;
    }

    public List<Integer> getAnswerIds() {
        return answerIds;
    }

    public void setAnswerIds(List<Integer> answerIds) {
        this.answerIds = answerIds;
    }
}
