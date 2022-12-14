package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ProjectConfig;
import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImp;
import com.spring.model.StudentModel;

public class Example1 {

	public static void main(String[] args) {
	System.out.println("Application started...");
	ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	StudentDao studentDao=context.getBean("studentDao",StudentDaoImp.class);
	StudentModel studentModel=context.getBean("studentModel",StudentModel.class);
	int result=studentDao.addStudentData(studentModel);
	System.out.println(result + " row is affected into database");
	}

}
