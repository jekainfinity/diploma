
package com.jekainfinity.hibernate.entity;


import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue(value = "theory")
public class UserResultForTheory extends UserResult{
    @Column(name = "SCORE")
    private int score;

    @OneToMany(mappedBy = "userResult")
    @Cascade({CascadeType.ALL})
    List<UserAnswer> userAnswers = new ArrayList<UserAnswer>();

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }
}

