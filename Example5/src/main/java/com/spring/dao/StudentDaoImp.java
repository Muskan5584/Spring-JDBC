package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	public List<StudentModel> getStudentData(StudentModel studentModel) {
        String query="select * from HSStudents";

        //creating object for RowMapper Interface.
        RowMapper<StudentModel> rowMapper=new RowMapper<StudentModel>() {
			public StudentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentModel studentModel=new StudentModel();
				studentModel.setId(rs.getInt(1));
				studentModel.setName(rs.getString(2));
				studentModel.setContact(rs.getInt(3));
				studentModel.setTotalMarks(rs.getInt(4));
				studentModel.setObtainMarks(rs.getInt(5));
				return studentModel;
			}
        };
        List<StudentModel> studentList=this.jdbcTemplate.query(query, rowMapper);
        return  studentList;
	}

}
