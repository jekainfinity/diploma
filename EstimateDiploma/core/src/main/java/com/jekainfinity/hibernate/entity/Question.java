package com.jekainfinity.hibernate.entity;

import com.jekainfinity.hibernate.entity.tasks.AbstractTask;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "QUESTION")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "QUESTION_ID")
    private int questionId;

    @Column(name = "QUESTION_TEXT")
    private String questionText;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "question")
    @Cascade({CascadeType.ALL})
    @Fetch (FetchMode.SELECT)
    private List<Answer> answers = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_ID")
    private AbstractTask theoryTask;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public AbstractTask getTheoryTask() {
        return theoryTask;
    }

    public void setTheoryTask(AbstractTask theoryTask) {
        this.theoryTask = theoryTask;
    }
}
