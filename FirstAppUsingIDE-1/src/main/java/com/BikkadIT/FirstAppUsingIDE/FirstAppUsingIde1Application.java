package com.BikkadIT.FirstAppUsingIDE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.FirstAppUsingIDE.controller.StudentController;
//Field Injection

	@SpringBootApplication
	public class FirstAppUsingIde1Application {

		public static void main(String[] args) {
			ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(FirstAppUsingIde1Application.class, args);
		
			StudentController bean = configurableApplicationContext.getBean("studentController",StudentController.class);
			
			bean.saveStudentController();
			
			
		}
	}




