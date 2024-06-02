package com.example.demo.employee;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "employee")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getOdbornostId() {
        return odbornostId;
    }

    public void setOdbornostId(Integer odbornostId) {
        this.odbornostId = odbornostId;
    }
}
