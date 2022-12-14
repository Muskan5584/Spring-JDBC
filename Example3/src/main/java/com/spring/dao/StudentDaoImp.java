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

	public int deleteStudentData(StudentModel studentModel) {
        String query="delete from HSStudents where id=?";
        int result=this.jdbcTemplate.update(query,studentModel.getId());
		return result;
	}

}
