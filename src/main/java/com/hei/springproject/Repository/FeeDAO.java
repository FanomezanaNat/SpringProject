package com.hei.springproject.Repository;

import com.hei.springproject.Entity.Fee;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class FeeDAO {
    private Connection connection;

    public FeeDAO(Connection connection) {
        this.connection = connection;
    }


    public void createFee(Fee fee) {
        String query = "CREATE FEE (id,month,year,type,amountPaid,paymentDate,paymentStatus,idStudent)VALUES(?,?,?,?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, fee.getId());
            preparedStatement.setString(2, fee.getMonth());
            preparedStatement.setInt(3, fee.getYear());
            preparedStatement.setString(4, fee.getType());
            preparedStatement.setInt(5, fee.getAmountPaid());
            preparedStatement.setDate(6, fee.getPaymentDate());
            preparedStatement.setBoolean(7, fee.getPaymentStatus());
            preparedStatement.setInt(8, fee.getIdStudent());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public void updateFee(Fee fee) {
        String query = "UPDATE fee set paymentStatus where id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setBoolean(1, fee.getPaymentStatus());
            preparedStatement.setInt(2, fee.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }


    }


    public List<Fee> getAllFees() {
        String query = "SELECT * FROM Fee";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Fee> fees = new ArrayList<>();
            while (resultSet.next()) {
                fees.add(new Fee(
                        resultSet.getInt("id"),
                        resultSet.getString("month"),
                        resultSet.getInt("year"),
                        resultSet.getString("type"),
                        resultSet.getInt("amountPaid"),
                        resultSet.getDate("paymentDate"),
                        resultSet.getBoolean("paymentSatus"),
                        resultSet.getInt("idStudent")
                ));
            }
            return fees;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void deleteFee(int feeId) {
        String query="DELETE FROM fee where id=?";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1,feeId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }

    }
}
