package com.jekainfinity.controllers;

import com.jekainfinity.hibernate.bean.PracticeTestBean;
import com.jekainfinity.hibernate.entity.enums.TheoryTaskLevel;
import com.jekainfinity.service.PractiseTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin/practiceTest")
public class PracticeTestAdminController {
    @Autowired
    private PractiseTestService practiceTestService;

    @RequestMapping(value = "/savePracticeTest", method = RequestMethod.GET)
    public String savePracticeTest(ModelMap model) {
        model.put("practiceTest", new PracticeTestBean());
        model.put("theoryTaskLevels", TheoryTaskLevel.values());
        return "practiceTest/addPracticeTest";
    }

    @RequestMapping(value = "/savePracticeTest", method = RequestMethod.POST)
    public String savePracticeTest(ModelMap model, @ModelAttribute("practiceTest") PracticeTestBean practiceTestBean) {
        practiceTestService.savePracticeTest(practiceTestBean);
        model.put("practiceTest", new PracticeTestBean());
        return "practiceTest/success";
    }

    @RequestMapping(value = "/practiceTestList", method = RequestMethod.GET)
    public String practiceTaskList(ModelMap model) {
        model.put("practiceTestList", practiceTestService.getListPractice());
        return "practiceTest/testList";
    }
}
