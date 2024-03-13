package com.example.studentManagement.repository;

import com.example.studentManagement.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
