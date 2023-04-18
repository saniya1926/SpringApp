package com.BikkadIT.SecondAppUsingIDE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BikkadIT.SecondAppUsingIDE.controller.StudentController;
//Without DI
@SpringBootApplication
public class SecondAppUsingIdeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondAppUsingIdeApplication.class, args);
		
		  StudentController studentController=new StudentController();
	       studentController.saveStudentController();
			
	}

}
