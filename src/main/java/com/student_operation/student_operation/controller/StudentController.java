package com.student_operation.student_operation.controller;

import com.student_operation.student_operation.entity.Student;
import com.student_operation.student_operation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/rollNum/{roll}")
    public String deleteStudent(@PathVariable int roll){
        return studentService.deleteStudent(roll);
    }

    @PutMapping("/updateStud/{roll}")
    public Student updateStudent(@PathVariable int roll,@RequestBody Student student){
        return studentService.updateStudent(roll,student);
    }

    @GetMapping()
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
}
