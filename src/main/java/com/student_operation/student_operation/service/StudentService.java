package com.student_operation.student_operation.service;

import com.student_operation.student_operation.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentByRoll(Integer roll);

    String deleteStudent(Integer roll);

    Student updateStudent(Integer roll,Student student);

    List<Student> getAllStudent();
}
