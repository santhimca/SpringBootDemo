package com.testing.springboot;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
 
        String[] beanNames = ctx.getBeanDefinitionNames();
         
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
	}
}
