package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.spring.model.StudentModel;

/*
 * @Configuration annotation indicates that, the following class has a configuration of other classes,
 * or it has some annotations like @Bean. It mean container has to gone through the class and create the 
 * instance of beans that are declared with @Bean.
 */
@Configuration
@ComponentScan("com.spring.dao")
public class ProjectConfig {

	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate(DataSource datasource) {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("dataSource")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/studentrecords");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean("studentModel")
	public StudentModel getStudentModel() {
		StudentModel studentModel=new StudentModel();
		studentModel.setId(102);
		return studentModel;
	}
}
