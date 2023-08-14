package com.hei.springproject.Service;

import com.hei.springproject.Entity.Student;
import com.hei.springproject.Repository.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentDAO dao;

    public StudentService(StudentDAO dao) {
        this.dao = dao;
    }
    public void createStudent(Student student){
        dao.createStudent(student);
    }
    public List<Student> getAllStudent(){
        return dao.getAllStudents();
    }
    public void deleteStudent(int studentId) {
        dao.deleteStudent(studentId);
    }
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }


}
