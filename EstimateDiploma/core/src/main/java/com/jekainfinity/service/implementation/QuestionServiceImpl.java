package com.jekainfinity.service.implementation;

import com.jekainfinity.hibernate.bean.AnswerBean;
import com.jekainfinity.hibernate.bean.QuestionBean;
import com.jekainfinity.hibernate.dao.QuestionDao;
import com.jekainfinity.hibernate.dao.TaskDao;
import com.jekainfinity.hibernate.entity.Answer;
import com.jekainfinity.hibernate.entity.Question;
import com.jekainfinity.hibernate.entity.tasks.TheoryTask;
import com.jekainfinity.service.QuestionService;
import com.jekainfinity.utill.mappers.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    Mapper mapper;

    @Autowired
    QuestionDao questionDao;

    @Autowired
    TaskDao taskDao;

    public int saveQuestion(QuestionBean questionBean, int theoryTaskId) {

        Question question = mapper.convertToQuestionObj(questionBean);

        List<Answer> answers = convertListAnswerBeanToAnswer(questionBean.getAnswers(), question);
        question.setTheoryTask(taskDao.read(theoryTaskId, TheoryTask.class));
        question.setAnswers(answers);

        questionDao.save(question);
        return question.getQuestionId();
    }

    private List<Answer> convertListAnswerBeanToAnswer(List<AnswerBean> list, Question question) {
        List<Answer> listAnswer = new ArrayList<>();

        for (AnswerBean answerBean: list) {
            Answer answer = mapper.convertAnswerBeanToAnswer(answerBean,question);
            listAnswer.add(answer);
        }

        return  listAnswer;
    }

    @Override
    public Question read(int id, Class clazz) {
        return questionDao.read(id, clazz);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Question> readQuestionByTheoryTaskId(Integer taskId) {
        return (ArrayList<Question>) questionDao.listByTask(taskId, Question.class);
    }
}
