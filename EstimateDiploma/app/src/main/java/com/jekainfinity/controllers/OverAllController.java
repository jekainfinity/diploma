package com.jekainfinity.controllers;

import com.jekainfinity.hibernate.entity.enums.Courses;
import com.jekainfinity.service.TaskService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/overall")
public class OverAllController {
    @Autowired
    TaskService taskService;



    @RequestMapping(value = "/theoryTaskList", method = RequestMethod.GET)
    public String getTheoryTaskList(Model model) {
        model.addAttribute("theoryList", taskService.getTheoryTaskList());
        return "theoryTask/theoryTaskList";
    }

    @RequestMapping(value = "/getCourses", method = RequestMethod.GET)
    public String getCourses(Model model) {
        model.addAttribute("courses", Courses.values());
        return "course/courseList";
    }

    /*TODO: Implement test by course name
      TODO: view: course/courseList
    */
}
