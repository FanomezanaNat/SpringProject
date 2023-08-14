package com.hei.springproject.Service;

import com.hei.springproject.Entity.Fee;
import com.hei.springproject.Repository.FeeDAO;

import java.util.List;

public class FeeService {
    private FeeDAO dao;

    public FeeService(FeeDAO dao) {
        this.dao = dao;
    }
    public List<Fee> getAllFees(){
        return dao.getAllFees();
    }
    public void createFee(Fee fee){
        dao.createFee(fee);
    }
    public void updateFee(Fee fee){
        dao.updateFee(fee);
    }
    public void deleteFee(int feeId){
        dao.deleteFee(feeId);
    }
}
