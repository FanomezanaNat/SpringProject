package com.hei.springproject.Controller;

import com.hei.springproject.Entity.Fee;
import com.hei.springproject.Service.FeeService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
public class FeeController {
    private FeeService service;

    public FeeController(FeeService service) {
        this.service = service;
    }

    @PostMapping("/createFee")
    public void createFee(@RequestBody Fee fee) {
        service.createFee(fee);
    }

    @GetMapping("/getAllFee")
    public List<Fee> getAllFees() {
        return service.getAllFees();

    }
    @GetMapping("/byType")
    public List<Fee> getPaymentsByType(@RequestParam String type) {
        return service.getPaymentByType(type);
    }

    @GetMapping("/latePayments")
    public List<Fee> getLatePayments(@RequestParam ("dueDate")  @DateTimeFormat(pattern = "yyyy-MM-dd") Date dueDate) {
        return service.getLatePayment(dueDate);
    }

    @GetMapping("/totalPaymentsForMonth")
    public int calculateTotalPaymentsForMonth(@RequestParam(name = "month") String month,@RequestParam( name = "year") int year) {
        return service.calculateTotalPaymentsForMonth(month, year);
    }
    @PutMapping("/updateFee")
    public void updateStudent(@RequestParam int id, @RequestBody Fee fee) {
        fee.setId(id);
        service.updateFee(fee);
    }

    @DeleteMapping("/deleteFeet")
    public void deleteStudent(@RequestParam int id) {
        service.deleteFee(id);
    }

}


