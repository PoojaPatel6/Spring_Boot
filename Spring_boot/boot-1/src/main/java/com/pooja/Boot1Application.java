package com.pooja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Boot1Application {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(Boot1Application.class, args);
		
//		System.out.println("hello");
//		Student s1 = new Student();
//		s1.patna();
		
		Student s1 = cxt.getBean(Student.class);
		s1.patna();

	}

}
