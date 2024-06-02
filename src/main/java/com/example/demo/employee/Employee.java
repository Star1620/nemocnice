package com.example.demo.employee;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean active;
    private String email;
    private LocalDate birthDate;
    private Integer odbornostId;

    public Employee(String firstName, String lastName, Boolean active, String email, LocalDate birthDate, Integer odbornostId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.email = email;
        this.birthDate = birthDate;
        this.odbornostId = odbornostId;
    }

    public Employee() {

    }
}
