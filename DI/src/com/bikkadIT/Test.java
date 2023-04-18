package com.bikkadIT;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Student stu1 = classPathXmlApplicationContext.getBean("stu", Student.class);
		System.out.println(stu1);

	}
}