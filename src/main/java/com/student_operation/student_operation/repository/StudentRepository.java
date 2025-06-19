package com.student_operation.student_operation.repository;

import com.student_operation.student_operation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
