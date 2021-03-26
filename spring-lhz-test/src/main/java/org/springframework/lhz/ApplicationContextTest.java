package org.springframework.lhz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.lhz.beans.Student;

public class ApplicationContextTest {
	public static void main(String[] args) {
		BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("spring1.xml"));
		Student stu1 = (Student)ctx.getBean("myTestBean");
		System.out.println("stu1 = [" + stu1 + "]");
	}
}
