package com.BikkadIT.SecondAppUsingIDE.service;

import com.BikkadIT.SecondAppUsingIDE.dao.StudentDao;

public class StudentService {
	public StudentService() {
		super();
		System.out.println("StudentService Constructor");
	}

	public void saveStudentService() {
		System.out.println("Taking data from controller layer and send to Dao Layer");
		StudentDao studentDao = new StudentDao();
		studentDao.saveStudentDao();
	}



}
