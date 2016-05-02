package com.jekainfinity.hibernate.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_RESULT")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "USER_RESULT_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class UserResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_RESULT_ID",unique = true,  nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    @Cascade({CascadeType.ALL})
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_ID")
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    private AbstractTask abstractTask;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AbstractTask getAbstractTask() {
        return abstractTask;
    }

    public void setAbstractTask(AbstractTask abstractTask) {
        this.abstractTask = abstractTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
