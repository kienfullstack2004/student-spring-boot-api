package com.springbootweb.students_web_api.Data;

import com.springbootweb.students_web_api.Entity.Sinhvien;
import com.springbootweb.students_web_api.connectionJDBC.ConnectionJDBC;

import java.sql.*;
import java.util.ArrayList;

public class StudentFetchData implements StudentData<Sinhvien> {

    public static StudentFetchData getInstance(){
        return new StudentFetchData();
    }
    @Override
    public String addStudent(Sinhvien student) throws SQLException {
        Connection connect = ConnectionJDBC.getConnection();
        try{
            Statement st = connect.createStatement();
            String sql = "INSERT INTO sinhvien (id,student_name,student_date,student_class,gender) "
                    + "VALUES ('"+student.getId()+"','"+student.getStudent_name()+"','"+student.getStudent_date()
                    +"','"+student.getStudent_class()+"','"+student.getGender()+"')";
           //  System.out.println(sql);
            int k = st.executeUpdate(sql);

            if(k > 0){
                System.out.println("Co "+ k + " duoc them vao");
               return "success";
            }

            ConnectionJDBC.closeConnection(connect);

        }catch (Exception e){

        }


        return "fail";
    }

    @Override
    public String updateStudent(Sinhvien student) throws SQLException {
        Connection connect = ConnectionJDBC.getConnection();

        try{

            Statement st = connect.createStatement();

            String sql = "UPDATE sinhvien SET student_name='"+student.getStudent_name()+"',student_date='"+student.getStudent_date()+"',student_class='"+student.getStudent_class()+"',gender='"
                    +student.getGender()+"' WHERE id="+student.getId();

            int k = st.executeUpdate(sql);

            if(k > 0){
                System.out.println("Co "+ k + " duoc cap nhat");
               return "success";
            }

            ConnectionJDBC.closeConnection(connect);

        }catch (Exception e){

        }

   return "fail";
    }

    @Override
    public String deleteStudent(String id) throws SQLException {

        Connection connect = ConnectionJDBC.getConnection();

        try{

            String sql = "DELETE FROM sinhvien WHERE id='"+id+"'";
            Statement st = connect.createStatement();
            System.out.println(sql);

            int k = st.executeUpdate(sql);

            if(k > 0){
                System.out.println("Co "+ k + " duoc xoa");
                return "success";
            }

            ConnectionJDBC.closeConnection(connect);

        }catch (Exception e){

        }



        return "fail";
    }

    @Override
    public Sinhvien findById(String idfind) throws SQLException {
        Sinhvien sv = new Sinhvien();

        Connection connect = ConnectionJDBC.getConnection();

        try{

            String sql = "SELECT * FROM sinhvien WHERE id='"+idfind+"'";
            Statement st = connect.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String id = rs.getString("id");
                String student_name = rs.getString("student_name");
                String student_date = rs.getString("student_date");
                String student_class= rs.getString("student_class");
                String gender = rs.getString("gender");

                sv = new Sinhvien(id,student_name,student_date,student_class,gender);
//                data.add(std);
            }


            ConnectionJDBC.closeConnection(connect);

        }catch (Exception e){

        }
        return sv;


    }

    @Override
    public ArrayList<Sinhvien> getAllStudents() throws SQLException {
        ArrayList<Sinhvien> data = new ArrayList<Sinhvien>();

        Connection connect = ConnectionJDBC.getConnection();

        try{

            String sql = "SELECT * FROM sinhvien";
            Statement st = connect.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String id = rs.getString("id");
                String student_name = rs.getString("student_name");
                String student_date = rs.getString("student_date");
                String student_class= rs.getString("student_class");
                String gender = rs.getString("gender");

                Sinhvien std = new Sinhvien(id,student_name,student_date,student_class,gender);
                data.add(std);

            }



            ConnectionJDBC.closeConnection(connect);

        }catch (Exception e){

        }

return data;

    }
}
