package com.jekainfinity.runner;

import com.jekainfinity.hibernate.bean.AnswerBean;
import com.jekainfinity.hibernate.bean.AnswerQuestionBlank;
import com.jekainfinity.hibernate.bean.QuestionBean;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestString {
    public static void main(String[] args) throws IOException {
        AnswerBean answerBean1 = new AnswerBean();
        AnswerBean answerBean2 = new AnswerBean();
        AnswerBean answerBean3 = new AnswerBean();
        QuestionBean questionBean = new QuestionBean();

        answerBean1.setAnswerText("answerBean1");
        answerBean2.setAnswerText("answerBean2");
        answerBean3.setAnswerText("answerBean3");

        answerBean1.setStatusRight(true);
        answerBean2.setStatusRight(true);
        answerBean3.setStatusRight(false);

        List<AnswerBean> answerBeanList = new ArrayList<AnswerBean>();
        answerBeanList.add(answerBean1);
        answerBeanList.add(answerBean2);
        answerBeanList.add(answerBean3);

        questionBean.setQuestionText("question1");
        questionBean.setAnswers(answerBeanList);

        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = mapper.writeValueAsString(questionBean);
        System.out.println(jsonInString);

        QuestionBean user1 = mapper.readValue(jsonInString, QuestionBean.class);
        System.out.println(questionBean.getQuestionText());
        System.out.println(questionBean.getAnswers().get(0).getAnswerText());

    }
}
