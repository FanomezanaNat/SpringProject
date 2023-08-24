package com.hei.springproject.Service;

import com.hei.springproject.Entity.Fee;
import com.hei.springproject.Repository.FeeDAO;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FeeService {
    private FeeDAO dao;

    public FeeService(FeeDAO dao) {
        this.dao = dao;
    }

    public List<Fee> getAllFees() {
        return dao.getAllFees();
    }

    public void createFee(Fee fee) {
        dao.createFee(fee);
    }

    public void updateFee(Fee fee) {
        dao.updateFee(fee);
    }

    public void deleteFee(int feeId) {
        dao.deleteFee(feeId);
    }

    public List<Fee> getPaymentByType(String type) {
        return dao.getPaymentsByType(type);
    }

    public List<Fee> getLatePayment(Date dueDate) {
        return dao.getLatePayments(dueDate);
    }

    public int calculateTotalPaymentsForMonth(String month, int year) {
        return dao.calculateTotalPaymentsForMonth(month, year);
    }
}
