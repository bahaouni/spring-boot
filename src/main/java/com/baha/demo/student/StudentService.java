package com.baha.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("BAHA","ouni", LocalDate.now(),"bahaouni1@gmail.com",21),
                new Student("BAHA1","ouni",LocalDate.now(),"bahaouni1@gmail.com",22)

        );
    }

}
