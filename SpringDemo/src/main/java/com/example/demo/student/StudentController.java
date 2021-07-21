package com.example.demo.student;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("api/student")

public class StudentController {

    private static final List<Student> STUDENTS=Arrays.asList(
          new Student(1,"Hemantha"
          ),
            new Student(2,"Hemantha2"
            ),
            new Student(3,"Gayan"),
            new Student(4,"Heshan")

    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        //System.out.println("OK");
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId())).findFirst()
                .orElseThrow(()->new IllegalStateException("student"+studentId+"not exhist"));

    }
}
