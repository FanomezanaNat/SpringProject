package com.hei.springproject.Repository;

import com.hei.springproject.Entity.Fee;

import java.util.List;

public interface FeeRepository {
    void createFee(Fee fee);
    void updateFee(Fee fee);
    public List<Fee> getAllFees();
    void deleteFee(int feeId);
}
