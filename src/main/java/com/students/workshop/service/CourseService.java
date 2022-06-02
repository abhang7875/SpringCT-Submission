package com.students.workshop.service;

import java.util.List;

import com.students.workshop.entity.Course;

public interface CourseService {
	public List<Course> getAllCourses();
	public Course addCourse(Course course);
}
