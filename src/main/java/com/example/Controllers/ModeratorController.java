package com.example.Controllers;

import com.example.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModeratorController {

    @Autowired
    private StudentsService studentsService;
    @RequestMapping("/home")
    public ModelAndView showHomePage(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("mainText", "HELLO MODERATOR");
        modelAndView.addObject("studentsList", studentsService.getAllStudents());

        return modelAndView;
    }

}
