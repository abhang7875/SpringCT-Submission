package com.students.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.students.workshop.entity.Student;
import com.students.workshop.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	public StudentController() {}
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/showStudents")
	public String showAllStudent(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("all_students", students);
		return "show_all_students";
	}
	
	@GetMapping("/addStudent")
	public String createStudent(Model model) {
		Student student = new Student();
		model.addAttribute("new_student", student);
		return "create_new_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/showStudents";
	}

}
