package com.BikkadIT.SecondAppUsingIDE.controller;

import com.BikkadIT.SecondAppUsingIDE.service.StudentService;

public class StudentController {
	public StudentController() {
		super();
		System.out.println("StudentController Constructor");
	}
	
	public void saveStudentController() {
		System.out.println("Taking data from UI and send it to Service layer");
		StudentService studentService=new StudentService();
		studentService.saveStudentService();

}
}