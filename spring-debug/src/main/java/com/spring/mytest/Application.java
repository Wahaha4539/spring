package com.spring.mytest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		A a = (A) context.getBean("a");
		System.out.println(a.getAge());
	}
}
