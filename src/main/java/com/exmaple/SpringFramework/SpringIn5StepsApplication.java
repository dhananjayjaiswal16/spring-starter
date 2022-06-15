package com.exmaple.SpringFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		com.exmaple.SpringFramework.BinarySearchImpl binarySearch =
				applicationContext.getBean(com.exmaple.SpringFramework.BinarySearchImpl.class);
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}