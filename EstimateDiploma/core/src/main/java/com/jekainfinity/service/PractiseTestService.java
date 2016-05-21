package com.jekainfinity.service;

import com.jekainfinity.hibernate.bean.CompileInform;
import com.jekainfinity.hibernate.bean.PracticeTestBean;
import com.jekainfinity.hibernate.entity.tasks.PracticeTask;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface PractiseTestService {
    void savePracticeTest(PracticeTestBean practiceTestBean);
    List<PracticeTask> getListPractice();
    Map<String, Integer> startChecking(String code, Integer practiceTestId);

    void createFile(String code, String fileName);

    CompileInform compileResult(String fileName) throws IOException;
}
