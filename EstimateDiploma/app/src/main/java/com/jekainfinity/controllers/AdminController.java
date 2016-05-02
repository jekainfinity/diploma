package com.jekainfinity.controllers;

import com.jekainfinity.hibernate.bean.QuestionBean;
import com.jekainfinity.hibernate.bean.TheoryTaskBean;
import com.jekainfinity.hibernate.dao.TaskDao;
import com.jekainfinity.hibernate.dao.UserDao;
import com.jekainfinity.hibernate.entity.Question;
import com.jekainfinity.hibernate.entity.TheoryTask;
import com.jekainfinity.hibernate.entity.enums.Courses;
import com.jekainfinity.hibernate.entity.enums.TheoryTaskLevel;
import com.jekainfinity.service.AdminService;
import com.jekainfinity.service.QuestionService;
import com.jekainfinity.service.TaskService;
import com.jekainfinity.service.UserService;
import com.jekainfinity.service.implementation.AdminServiceImpl;
import com.jekainfinity.utill.mappers.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @Autowired
    UserService userService;

    @Autowired
    Mapper mapper;

    @Autowired
    UserDao userDao;

    @Autowired
    TaskService taskService;

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboard(){
        return "admin/dashboard";
    }

    @RequestMapping(value = "/getTheoryTask", method = RequestMethod.GET)
    public String getTheoryTask(Model model){
        List<TheoryTask> theoryTaskList = taskService.getTheoryTaskList();
        model.addAttribute("theoryList", theoryTaskList);
        System.out.println(theoryTaskList.size());
        return "theoryTask/theoryTaskList";
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String getUsers(Model model){
        model.addAttribute("users",userService.getUserList());
        return "admin/userList";
    }

    @RequestMapping(value = "/addTheoryTask", method = RequestMethod.GET)
    public String addTheoryTask(Model model) {
        model.addAttribute("theoryTask", new TheoryTaskBean());
        model.addAttribute("theoryTaskLevels", TheoryTaskLevel.values());
        model.addAttribute("courses", Courses.values());
        return "theoryTask/addTheoryTask";
    }

    @RequestMapping(value = "/addTheoryTask", method = RequestMethod.POST)
    public String addTheoryTask(@ModelAttribute("theoryTask") TheoryTaskBean taskBean, Model model) {
        Integer taskId = taskService.saveTask(taskBean);
        model.addAttribute("taskName", taskBean.getTaskName());
        model.addAttribute("taskLevel", taskBean.getTheoryTaskLevel());
        model.addAttribute("taskCourse", taskBean.getCourse());
        model.addAttribute("taskDescription", taskBean.getTaskDescription());
        model.addAttribute("taskId", taskId);
        return "theoryTask/confirmAddTheory";
    }

    @RequestMapping(value = "/addQuestion/{theoryTaskId}", method = RequestMethod.GET)
    public String addQuestion(Model model, @PathVariable("theoryTaskId") int theoryTaskId) {
        model.addAttribute("taskId", theoryTaskId);
        return "question/addQuestion";
    }

    @RequestMapping(value = "/addQuestion/{theoryTaskId}", method = RequestMethod.POST)
    public @ResponseBody int addQuestion(@RequestBody final QuestionBean questionBean, @PathVariable("theoryTaskId") int theoryTaskId) {
        int id = questionService.saveQuestion(questionBean,theoryTaskId);
        return id;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public Mapper getMapper() {
        return mapper;
    }

    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }
}
