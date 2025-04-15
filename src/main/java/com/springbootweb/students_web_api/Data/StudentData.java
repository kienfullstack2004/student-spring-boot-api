package com.springbootweb.students_web_api.Data;

import com.springbootweb.students_web_api.Entity.Sinhvien;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentData<T>{

    public String addStudent(T t) throws SQLException;

    public String updateStudent(T t) throws SQLException;

    public String deleteStudent(String id) throws SQLException;

    public ArrayList<T> getAllStudents() throws SQLException;

    public Sinhvien findById(String id) throws SQLException;

}
