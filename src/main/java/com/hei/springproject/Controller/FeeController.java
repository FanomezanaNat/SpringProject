package com.hei.springproject.Controller;

import com.hei.springproject.Entity.Fee;
import com.hei.springproject.Service.FeeService;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/updateFee/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Fee fee) {
        fee.setId(id);
        service.updateFee(fee);
    }

    @DeleteMapping("/deleteFeet/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.deleteFee(id);
    }
}


