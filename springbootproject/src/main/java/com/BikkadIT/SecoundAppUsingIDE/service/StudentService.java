package com.BikkadIT.SecoundAppUsingIDE.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public StudentService() {
		super();
	System.out.println("StudentService Constructor");
	}
	public void saveStudentService() {
		System.out.println("Talking data from controller layer and send tp Dao layer");
	}
	

}
