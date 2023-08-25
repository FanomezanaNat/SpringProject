package com.hei.springproject.Controller;

import com.hei.springproject.Entity.Student;
import com.hei.springproject.Service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StudentController {
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/createStudent")
    public void createStudent(@RequestBody Student student) {
        service.createStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudents()  {
        return service.getAllStudent();
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent(@RequestParam String firstName){
        return service.getStudent(firstName);
    }
    @GetMapping("/getStudyByStudyYear")
    public List<Student> getStudentByStudyYear(@RequestParam int studyYear){
        return service.getStudentByStudyYear(studyYear);
    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestParam int id, @RequestBody Student student) {
        student.setId(id);
        service.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam int id) {
        service.deleteStudent(id);
    }
}
