package com.hei.springproject.Repository;

import com.hei.springproject.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
/*All methods for the entity Student*/
public interface StudentRepository {
    void createStudent(Student student);

    List<Student> getAllStudents();

    void updateStudent(Student student);

    void deleteStudent(int studentId);
}
