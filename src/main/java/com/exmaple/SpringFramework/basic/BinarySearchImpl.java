package com.exmaple.SpringFramework.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearchImpl {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// Search the array
		return 3;
	}

	//As soon as BEan is created the postConstruct method is called
	@PostConstruct
	public void postConstruct(){
		logger.info("PostConstruct called");
	}

	//preDestroy is called just before bean is removed from the context
	@PreDestroy
	public void preDestroy(){
		logger.info("PreDestroy called");
	}

}
