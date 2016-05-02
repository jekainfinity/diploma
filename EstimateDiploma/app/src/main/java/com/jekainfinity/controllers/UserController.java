package com.jekainfinity.controllers;

import com.jekainfinity.hibernate.bean.RequestAnswer;
import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.entity.TheoryTask;
import com.jekainfinity.hibernate.entity.User;
import com.jekainfinity.service.QuestionService;
import com.jekainfinity.service.TaskService;
import com.jekainfinity.service.UserResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    TaskService taskService;

    @Autowired
    UserResultService userResultService;

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboard(){
        return "user/dashboard";
    }

    @RequestMapping(value = "/getUserProfile", method = RequestMethod.GET)
    public String userProfile(Principal principal, Model model){
        model.addAttribute("user",userDao.findByUserName(principal.getName()));
        return "userProfile";
    }

    @RequestMapping(value = "/getTheoryTask", method = RequestMethod.GET)
    public String getTheoryTask(){
        return "redirect:/overall/theoryTaskList";
    }

    @RequestMapping(value = "/passTheoryTask/{theoryTaskId}", method = RequestMethod.GET)
    public String passTest(@PathVariable("theoryTaskId") int taskId, Model model){
        model.addAttribute("questions", questionService.readQuestionByTheoryTaskId(taskId));
        model.addAttribute("taskId", taskId);
        return "passTest/passTheoryTest";
    }

    @RequestMapping(value = "/passTheoryTask", method = RequestMethod.POST)
    public String passTest(@RequestBody final RequestAnswer requestAnswer, Principal principal){
        userResultService.createUserResult(requestAnswer, principal.getName());
        return "passTest/passTheoryTest/getScore";
    }


}
