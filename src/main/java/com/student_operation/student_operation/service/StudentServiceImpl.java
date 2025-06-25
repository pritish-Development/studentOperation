package com.student_operation.student_operation.service;

import com.student_operation.student_operation.entity.Student;
import com.student_operation.student_operation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Student s =  studentRepository.findById(roll).orElse(null);
        return s;
    }

    @Override
    public String deleteStudent(Integer roll) {
        studentRepository.deleteById(roll);
        return "Student deleted successfully";
    }

    @Override
    public Student updateStudent(Integer roll, Student student) {
        Student s = studentRepository.findById(roll).orElse(null);
        if (s != null) {
            s.setStudName(student.getStudName());
            s.setAge(student.getAge());
            s.setStudCity(student.getStudCity());
            return studentRepository.save(s);
        }
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}

