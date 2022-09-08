package com.heptagon.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {

    private String empId;
    private String name;
    private String designation;
    private double salary;
}
