package com.students.workshop.service;

import java.util.List;

import com.students.workshop.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student addStudent(Student student);
}
