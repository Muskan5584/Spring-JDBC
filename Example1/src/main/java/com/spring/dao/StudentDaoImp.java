package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.spring.model.StudentModel;

  /*
   * Repository annotation is indicates that, these class is dealing with Database CRUD operation.
   * Spring container is responsible to create the instance of these @Repository annotated class. 
   */
@Repository("studentDao")
public class StudentDaoImp implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public int addStudentData(StudentModel studentModel) {
		String query="insert into HSStudents values(?,?,?,?,?)";
		int result=this.jdbcTemplate.update(query,studentModel.getId(),studentModel.getName(),studentModel.getContact(),
				                            studentModel.getTotalMarks(),studentModel.getObtainMarks());
		return result;
	}

}
