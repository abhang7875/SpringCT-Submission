package com.students.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.workshop.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
