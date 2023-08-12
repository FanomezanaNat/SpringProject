package com.hei.springproject.Crud;

import com.hei.springproject.Entity.Fee;
import com.hei.springproject.Repository.FeeRepository;

import java.sql.Connection;
import java.util.List;

public class FeeCrud implements FeeRepository {
    private Connection connection;

    public FeeCrud(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void createFee(Fee fee) {

    }

    @Override
    public void updateFee(Fee fee) {

    }

    @Override
    public List<Fee> getAllFees() {
        return null;
    }

    @Override
    public void deleteFee(int feeId) {

    }
}
