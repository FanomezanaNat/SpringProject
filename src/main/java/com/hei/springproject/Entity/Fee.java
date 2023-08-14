package com.hei.springproject.Entity;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Fee {
    private int id;
    private String month;
    private int year;
    private String type;
    private int amountPaid;
    private Date paymentDate;
    private Boolean paymentStatus;
    private int idStudent;
}
