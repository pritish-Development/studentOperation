package com.student_operation.student_operation.controller;

import com.student_operation.student_operation.entity.Student;
import com.student_operation.student_operation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStud")
    public Student addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/rollnum/{roll}")
    public Student getStudByRoll(@PathVariable int roll){
        return studentService.getStudentByRoll(roll);
    }

}
