package com.spring.dao;

import java.util.List;

import com.spring.model.StudentModel;

public interface StudentDao {
	public List<StudentModel> getStudentData(StudentModel studentModel);

}
