package org.springframework.lhz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lhz.beans.Student;

public class ApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring1.xml");
		Student stu1 = ctx.getBean(Student.class);
		System.out.println("stu1 = [" + stu1 + "]");

	}
}
