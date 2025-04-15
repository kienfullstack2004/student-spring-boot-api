package com.springbootweb.students_web_api;

import com.springbootweb.students_web_api.Data.StudentFetchData;
import com.springbootweb.students_web_api.Entity.Sinhvien;
import com.springbootweb.students_web_api.connectionJDBC.ConnectionJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class StudentsWebApiApplication {

	public static void main(String[] args) throws SQLException {

		SpringApplication.run(StudentsWebApiApplication.class, args);

//		Connection c = ConnectionJDBC.getConnection();
//		Sinhvien sv = new Sinhvien("1","Nguyen Trung Kien","2024","TMP","M");
//
//		StudentFetchData.getInstance().addStudent(sv);




	}

}
