package com.springbootweb.students_web_api.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sinhvien {
    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String student_name;
    String student_date;
    String student_class;
    String gender;

    public Sinhvien(String id, String student_name, String student_date, String student_class, String gender) {
        this.id = id;
        this.student_name = student_name;
        this.student_date = student_date;
        this.student_class = student_class;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_date() {
        return student_date;
    }

    public void setStudent_date(String student_date) {
        this.student_date = student_date;
    }

    public String getStudent_class() {
        return student_class;
    }

    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Sinhvien() {
    }
}
