package com.exmaple.SpringFramework;

import com.exmaple.SpringFramework.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringFrameworkBasicApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringFrameworkBasicApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());

	}
}