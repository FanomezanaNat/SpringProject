package com.hei.springproject.Repository;

import com.hei.springproject.Entity.Fee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
/* All the methods for the entity Fee*/
public interface FeeRepository {
    void createFee(Fee fee);
    void updateFee(Fee fee);
    public List<Fee> getAllFees();
    void deleteFee(int feeId);
}
