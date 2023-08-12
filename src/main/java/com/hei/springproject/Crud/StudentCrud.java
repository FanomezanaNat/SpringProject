package com.hei.springproject.Crud;

import com.hei.springproject.Entity.Student;
import com.hei.springproject.Repository.StudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentCrud implements StudentRepository {
    private Connection connection;

    public StudentCrud(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void createStudent(Student student) {
        String query = "INSERT INTO Student (id,firstName,lastName,address,phoneNumber,email,studyYear) VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setInt(5, student.getPhoneNumber());
            preparedStatement.setString(6, student.getEmail());
            preparedStatement.setInt(7, student.getStudyYear());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(int studentId) {

    }
}
