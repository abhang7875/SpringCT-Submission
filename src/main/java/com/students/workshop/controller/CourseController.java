package com.students.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.students.workshop.entity.Course;
import com.students.workshop.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	@GetMapping("/showCourses")
	public String showAllCourses(Model model) {
		List<Course> courses = courseService.getAllCourses();
		model.addAttribute("all_courses", courses);
		return "show_all_courses";
	}
	
	@GetMapping("/addCourse")
	public String createCourse(Model model) {
		Course course = new Course();
		model.addAttribute("new_course", course);
		return "create_new_course";
	}
	
	@PostMapping("/courses")
	public String saveStudent(@ModelAttribute("course") Course course) {
		courseService.addCourse(course);
		return "redirect:/showCourses";
	}

}
