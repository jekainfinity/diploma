package com.jekainfinity.hibernate.entity;

import com.jekainfinity.hibernate.entity.enums.Courses;
import com.jekainfinity.hibernate.entity.enums.TheoryTaskLevel;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue(value = "theoryTask")
public class TheoryTask extends AbstractTask {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "theoryTask")
    @Cascade({CascadeType.ALL})
    private Set<Question> questions = new HashSet<Question>(0);

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

}
