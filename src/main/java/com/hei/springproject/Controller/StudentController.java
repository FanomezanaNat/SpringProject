package com.hei.springproject.Controller;

import com.hei.springproject.Entity.Student;
import com.hei.springproject.Service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class StudentController {
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody Student student) {
        service.createStudent(student);
    }

    @GetMapping("/listStudent")
    public List<Student> getAllStudents()  {
        return service.getAllStudent();
    }

    @PutMapping("/updateStudent/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        service.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
    }
}
