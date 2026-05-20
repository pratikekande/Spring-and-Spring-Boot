package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.ServiceLayer;
import com.telusko.web.Web;

@SpringBootApplication  //== @ComponentScan + AutoConfiguration
public class Springboot1Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container = SpringApplication.run(Springboot1Application.class, args);
//		int count=container.getBeanDefinitionCount();
//		System.out.println("Count is "+ count);//57-5 ==> 52
//		String[] names = container.getBeanDefinitionNames();
//		for(String bn:names)
//		{
//			System.out.println(bn);
//		}
//		
		ServiceLayer ser = container.getBean(ServiceLayer.class);
		ser.service();
		
		Web web = container.getBean(Web.class);
		web.service();
		
	}

}
