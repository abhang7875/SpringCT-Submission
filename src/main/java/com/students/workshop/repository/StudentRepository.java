package com.students.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.workshop.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
