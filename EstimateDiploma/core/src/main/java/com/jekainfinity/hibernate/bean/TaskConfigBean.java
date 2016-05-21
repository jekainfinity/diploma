package com.jekainfinity.hibernate.bean;

import com.jekainfinity.hibernate.entity.tasks.TheoryTask;
import com.jekainfinity.hibernate.entity.enums.Courses;
import com.jekainfinity.hibernate.entity.enums.TheoryTaskLevel;

import java.util.HashSet;
import java.util.Set;

public class TaskConfigBean {
    public TheoryTaskLevel theoryTaskLevel;
    public int questionCount;
    public String taskConfigName;
    public Courses course;
    private Set<TheoryTask> theoryTasks = new HashSet<>();

    public TheoryTaskLevel getTheoryTaskLevel() {
        return theoryTaskLevel;
    }

    public void setTheoryTaskLevel(TheoryTaskLevel theoryTaskLevel) {
        this.theoryTaskLevel = theoryTaskLevel;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public String getTaskConfigName() {
        return taskConfigName;
    }

    public void setTaskConfigName(String taskConfigName) {
        this.taskConfigName = taskConfigName;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Set<TheoryTask> getTheoryTasks() {
        return theoryTasks;
    }

    public void setTheoryTasks(Set<TheoryTask> theoryTasks) {
        this.theoryTasks = theoryTasks;
    }
}
