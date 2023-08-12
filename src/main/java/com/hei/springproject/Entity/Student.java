package com.hei.springproject.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private String reference;
    private String address;
    private int phoneNumber;
    private String email;
    private int studyYear;
}
