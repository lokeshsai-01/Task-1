package com.springexample.restdemo.controller;

import com.springexample.restdemo.Structure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

    @Autowired
    private StructureAPIService structureAPIService;
    @GetMapping("/templates/List.html")
    public String getDetails(Model model){
        model.addAttribute("list",structureAPIService.getAllDetails());
        return "List";
    }

    @GetMapping("/templates/Newstudent.html")
    public String register(Model model){
        Structure student = new Structure();
        model.addAttribute("student",student);
        return "Newstudent";
    }

    @PostMapping("/register")
    public String submitNewDetails(@ModelAttribute("student")Structure student){
        structureAPIService.updateStructureDetails(student);
        return "redirect:/";
    }

    @GetMapping("/templates/delete.html")
    public String delete(Model model){
        Structure student = new Structure();
        model.addAttribute("student",student);
        return "delete";
    }
    @PostMapping("/delete")
    public String deleteDetails(@ModelAttribute("student")Structure student){
        structureAPIService.deleteStructureDetails(student.getStudentID());
        return "redirect:/";
    }

}
