package com.jekainfinity.hibernate.entity.tasks;

import com.jekainfinity.hibernate.entity.userResult.UserResult;
import com.jekainfinity.hibernate.entity.enums.Courses;
import com.jekainfinity.hibernate.entity.enums.TheoryTaskLevel;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TASK")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TASK_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class AbstractTask{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TASK_ID",unique = true,  nullable = false)
    public int taskId;

    @Column(name = "TASK_NAME")
    public String taskName;

    @Column(name = "TASK_DESCRIPTION")
    public String taskDescription;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "TASK_LEVEL")
    private TheoryTaskLevel theoryTaskLevel;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "COURSE", nullable = true)
    private Courses course;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "abstractTask")
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    private Set<UserResult> userResults = new HashSet<UserResult>();

    public Set<UserResult> getUserResults() {
        return userResults;
    }

    public void setUserResults(Set<UserResult> userResults) {
        this.userResults = userResults;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public TheoryTaskLevel getTheoryTaskLevel() {
        return theoryTaskLevel;
    }

    public void setTheoryTaskLevel(TheoryTaskLevel theoryTaskLevel) {
        this.theoryTaskLevel = theoryTaskLevel;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
}

