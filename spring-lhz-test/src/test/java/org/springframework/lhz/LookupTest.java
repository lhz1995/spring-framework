package org.springframework.lhz;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.lhz.beans.GetBeanTest;

public class LookupTest {

	@Test
	public void test() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("lookupTest.xml");
		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
		BeanDefinition beanDefinition = ((ClassPathXmlApplicationContext) bf).getBeanFactory().getBeanDefinition("getBeanTest");
		System.out.println(beanDefinition);
		test.showMe();
	}
}
