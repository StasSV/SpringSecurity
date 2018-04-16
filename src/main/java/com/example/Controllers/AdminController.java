package com.example.Controllers;

import com.example.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping("/admin")
    public ModelAndView workWithStudents() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        modelAndView.addObject("mainText", "HELLO ADMIN");
        modelAndView.addObject("studentsList", studentsService.getAllStudents());

        return modelAndView;
    }
}
