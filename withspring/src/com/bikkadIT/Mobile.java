package com.bikkadIT;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext  classPathxmlAplicationContext=new ClassPathXmlApplicationContext("beans.xml"); 
	     
		
		Airtel air=classPathxmlAplicationContext.getBean("airtel",Airtel.class);
		air.calling();
		air.browse();
		
		Vodaphone vod=classPathxmlAplicationContext.getBean("vodaphone",Vodaphone.class);
		vod.calling();
		vod.browse();

		Airtel air1=classPathxmlAplicationContext.getBean("Sim",Airtel.class);
		air1.calling();
		air1.browse();
		

		Vodaphone vod1=classPathxmlAplicationContext.getBean("Sim1",Vodaphone.class);
		vod1.calling();
		vod1.browse();
		
	}
	

}
