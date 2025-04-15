package com.springbootweb.students_web_api.controllers;

//import com.springbootweb.students_web_api.Data.StudentFetchData;
import com.springbootweb.students_web_api.Data.StudentFetchData;
import com.springbootweb.students_web_api.Entity.Sinhvien;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin("http://localhost:5173")
public class StudentControllers {

    @PostMapping("/create")
    public String create(@RequestBody Sinhvien std) throws SQLException {
        return StudentFetchData.getInstance().addStudent(std);
    }

    @GetMapping("/getAll")
    public List<Sinhvien> getStudents() throws SQLException {
        return StudentFetchData.getInstance().getAllStudents();
    }

    @PutMapping("/update")
    public String update(@RequestBody Sinhvien std) throws SQLException {
        return StudentFetchData.getInstance().updateStudent(std);
    }

    @DeleteMapping("/{stdId}")
    public String delete(@PathVariable("stdId") String id) throws SQLException {
        System.out.println(id);
        return StudentFetchData.getInstance().deleteStudent(id);
    }

    @GetMapping("/detail/{stdId}")
    public Sinhvien getOne(@PathVariable("stdId") String id) throws SQLException {
        return StudentFetchData.getInstance().findById(id);
    }

}
