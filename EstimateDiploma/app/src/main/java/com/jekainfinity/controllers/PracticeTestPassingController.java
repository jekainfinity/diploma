package com.jekainfinity.controllers;

import com.jekainfinity.hibernate.bean.CompileInform;
import com.jekainfinity.service.PractiseTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.security.Principal;

@Controller
@RequestMapping("/user/testPassingPractice")
public class PracticeTestPassingController {

    @Autowired
    private PractiseTestService practiceTestService;

    @RequestMapping(value = "/practiceTestPass", method = RequestMethod.GET)
    public String practiceTest(ModelMap model, Principal principal) {
        /*model.addAttribute("username", principal.getName());*/
        return "practiceTest/practicePass";
    }

    @RequestMapping(value = "/practiceTestPass/{practiceTestId}", method = RequestMethod.POST)
    public String practiceTest(@RequestParam("code") String code,
                               @PathVariable("practiceTestId") int practiceTestId,
                               @RequestParam("fileName") String fileName,
                               ModelMap modelMap) {
        CompileInform ci = null;
        try {
            practiceTestService.createFile(code, fileName);
            ci = practiceTestService.compileResult(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (ci.isStatus()) {
            modelMap.addAttribute("compileResult", ci.getResult());
        } else  {
            modelMap.addAttribute("errors", ci.getListErr());
        }

        return "adsada";
    }

    @RequestMapping(value = "/practiceTestList", method = RequestMethod.GET)
    public String practiceTaskList(ModelMap model) {
        model.put("practiceTestList", practiceTestService.getListPractice());
        return "practiceTest/testList";
    }
}
