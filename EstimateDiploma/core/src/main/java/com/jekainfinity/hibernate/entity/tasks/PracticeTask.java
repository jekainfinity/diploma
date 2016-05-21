package com.jekainfinity.hibernate.entity.tasks;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "practiceTask")
public class PracticeTask extends AbstractTask {
    @Column(name = "PURPOSE_TEXT")
    private String purposeText;

    public String getPurposeText() {
        return purposeText;
    }

    public void setPurposeText(String purposeText) {
        this.purposeText = purposeText;
    }
}
