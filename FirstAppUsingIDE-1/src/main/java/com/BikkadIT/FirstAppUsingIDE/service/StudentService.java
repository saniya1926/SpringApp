package com.BikkadIT.FirstAppUsingIDE.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.BikkadIT.FirstAppUsingIDE.dao.StudentDao;

public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public StudentService() {
		super();
		System.out.println("StudentService Constructor");
	}

	public void saveStudentService() {
		System.out.println("Taking data from controller layer and send to Dao Layer");

		studentDao.saveStudentDao();
	}

	public void saveStudentService() {
		// TODO Auto-generated method stub
		
	}

	
		
	}




