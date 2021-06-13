package org.example.aigiri.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.example.aigiri.rest.entity.Student;
import org.example.aigiri.rest.service.StudentService;


@Controller
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping( path="/all")
    public @ResponseBody Iterable<Student> getAllStudents() {
        // This returns a JSON or XML with the users
        return studentService.getAll();
    }

    @PostMapping(path = "/")
    public @ResponseBody Student saveStudent(@RequestBody Student inputStudent){
        return studentService.saveStudent(inputStudent);
    }
}
