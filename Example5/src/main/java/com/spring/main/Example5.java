package com.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ProjectConfig;
import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImp;
import com.spring.model.StudentModel;

public class Example5 {

	public static void main(String[] args) {
	System.out.println("Application started...");
	ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
	StudentDao studentDao=context.getBean("studentDao",StudentDaoImp.class);
	StudentModel studentModel=context.getBean("studentModel",StudentModel.class);
	
    List<StudentModel> studentList=studentDao.getStudentData(studentModel);
	 for(StudentModel s:studentList) {
		System.out.println(s);
	 }
	}

}
