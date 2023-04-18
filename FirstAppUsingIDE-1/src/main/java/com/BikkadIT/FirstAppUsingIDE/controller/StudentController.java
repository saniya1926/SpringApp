package com.BikkadIT.FirstAppUsingIDE.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.BikkadIT.FirstAppUsingIDE.service.StudentService;

public class StudentController {
	@Autowired
	private StudentService studentService;

	public StudentController() {
		super();
		System.out.println("StudentController Constructor");
	}

	public void saveStudentController() {
		System.out.println("Taking data from UI and send it to Service layer");

		studentService.saveStudentService();
	}

}

