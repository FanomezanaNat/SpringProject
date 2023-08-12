package com.hei.springproject.Crud;

import com.hei.springproject.Entity.Student;
import com.hei.springproject.Repository.StudentRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentCrud implements StudentRepository {
    private final Connection connection;

    public StudentCrud(Connection connection) {
        this.connection = connection;
    }

    @Override
    /*Method to create a student*/
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
        String query = "SELECT * FROM Student";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("id"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("address"),
                        resultSet.getInt("phoneNumber"),
                        resultSet.getString("email"),
                        resultSet.getInt("studyYear")
                ));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    /*Method to update the information of a student*/
    public void updateStudent(Student student) {
        String query = "UPDATE student SET studyYear=? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, student.getStudyYear());
            preparedStatement.setInt(2, student.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    /*Method to delete the student*/
    public void deleteStudent(int studentId) {

    }
}
