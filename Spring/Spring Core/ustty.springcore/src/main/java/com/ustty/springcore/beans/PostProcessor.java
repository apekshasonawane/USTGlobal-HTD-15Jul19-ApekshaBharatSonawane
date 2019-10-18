package com.ustty.springcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean,String beanName) {
		if(beanName.equals("obj")) {
			System.out.println("HelloWorld before Init");
		}else if(beanName.equals("dog")) {
			System.out.println("Dog before Init");
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean name After Initialization:"+beanName);
		return bean;
	}
}
