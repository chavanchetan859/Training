package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		
		Employee e=(Employee)context.getBean("employee");
		
		System.out.println(e);

	}

}
