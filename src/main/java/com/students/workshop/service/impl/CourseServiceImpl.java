package com.students.workshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.workshop.entity.Course;
import com.students.workshop.repository.CourseRepository;
import com.students.workshop.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepo;
	public CourseServiceImpl() {}
	
	public CourseServiceImpl(CourseRepository courseRepo) {
		super();
		this.courseRepo = courseRepo;
	}

	@Override
	public Course addCourse(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

}
