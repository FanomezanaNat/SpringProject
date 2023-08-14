package com.hei.springproject.Repository;

import com.hei.springproject.DatabaseConfiguration.DatabaseConnection;
import com.hei.springproject.Entity.Student;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAO {
    private  Connection connection;

    public StudentDAO(Connection connection) {
        this.connection=new DatabaseConnection().getConnection();
    }


    /*Method to create a student*/
    public void createStudent(Student student) {
        String query = "INSERT INTO Student (id,firstName,lastName,reference,phoneNumber,email,address,studyYear) VALUES (?,?,?,?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4,student.getReference());
            preparedStatement.setInt(5, student.getPhoneNumber());
            preparedStatement.setString(6, student.getEmail());
            preparedStatement.setString(7, student.getAddress());
            preparedStatement.setInt(8, student.getStudyYear());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



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
                        resultSet.getString("reference"),
                        resultSet.getInt("phoneNumber"),
                        resultSet.getString("email"),
                        resultSet.getString("address"),
                        resultSet.getInt("studyYear")
                ));
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


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


    /*Method to delete the student*/
    public void deleteStudent(int studentId) {
        String query = "DELETE FROM student WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
