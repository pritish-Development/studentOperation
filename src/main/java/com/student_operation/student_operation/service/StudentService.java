package com.student_operation.student_operation.service;

import com.student_operation.student_operation.entity.Student;

public interface StudentService {
    Student createStudent(Student student);
    Student getStudentByRoll(Integer roll);
}
