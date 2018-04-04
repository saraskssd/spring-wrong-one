package com.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Training {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Training t=(Training)context.getBean("trainingTopic");
	}
