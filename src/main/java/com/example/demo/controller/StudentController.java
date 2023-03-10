package com.example.demo.controller;

import com.example.demo.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
            1,
          "Vishal",
          "Singh"
        );
          return student;
    }

    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Vishal", "Singh"));
        student.add(new Student(2, "Priti", "Singh"));
        student.add(new Student(3, "Kuhoo", "Singh"));
        student.add(new Student(4, "Vibha", "Singh"));
        student.add(new Student(5, "Nikhil", "Singh"));
        return student;
    }

}
