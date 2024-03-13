package com.example.studentManagement.repository;

import com.example.studentManagement.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findAllBySatScoreGreaterThan(Integer satScore);
}
