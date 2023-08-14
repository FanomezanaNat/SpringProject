package com.hei.springproject.Repository;

import com.hei.springproject.Entity.Fee;

import java.sql.Connection;
import java.util.List;

public class FeeCrud  {
    private Connection connection;

    public FeeCrud(Connection connection) {
        this.connection = connection;
    }


    public void createFee(Fee fee) {

    }
    public void updateFee(Fee fee) {

    }


    public List<Fee> getAllFees() {
        return null;
    }


    public void deleteFee(int feeId) {

    }
}
