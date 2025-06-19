package com.student_operation.student_operation.service;

import com.student_operation.student_operation.entity.Student;
import com.student_operation.student_operation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentByRoll(Integer roll) {
        return studentRepository.findById(roll).orElse(null);
    }
}
