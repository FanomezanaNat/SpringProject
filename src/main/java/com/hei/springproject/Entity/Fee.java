package com.hei.springproject.Entity;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Fee {
    private int id;
    private int year;
    private String type;
    private int amountPaid;
    private Date paymentDate;
    private String paymentStatus;
}
