package com.project.manage.service.projectmanageservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class ProjectManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManageServiceApplication.class, args);
	}
}

//To build as a war file and deploy in Tomcat container
/*
@SpringBootApplication
public class ProjectManageServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManageServiceApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(ProjectManageServiceApplication.class);
		
	}
}*/


