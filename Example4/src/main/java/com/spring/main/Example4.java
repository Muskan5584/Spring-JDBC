package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ProjectConfig;
import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImp;
import com.spring.model.StudentModel;

public class Example4 {

	public static void main(String[] args) {
	System.out.println("Application started...");
	ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	StudentDao studentDao=context.getBean("studentDao",StudentDaoImp.class);
	StudentModel studentModel=context.getBean("studentModel",StudentModel.class);
	
    StudentModel result=studentDao.getStudentData(studentModel);
	System.out.println(result);
	}

}
