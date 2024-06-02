package com.example.demo.rezervace;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "rezervace")
public class Rezervace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer employeeId;
    private Integer salId;
    private LocalDateTime startReservation;
    private LocalDateTime endReservation;

    public Rezervace(Integer id, Integer employeeId, Integer salId, LocalDateTime startReservation, LocalDateTime endReservation) {
        this.id = id;
        this.employeeId = employeeId;
        this.salId = salId;
        this.startReservation = startReservation;
        this.endReservation = endReservation;
    }

    public Rezervace() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
    }

    public LocalDateTime getStartReservation() {
        return startReservation;
    }

    public void setStartReservation(LocalDateTime startReservation) {
        this.startReservation = startReservation;
    }

    public LocalDateTime getEndReservation() {
        return endReservation;
    }

    public void setEndReservation(LocalDateTime endReservation) {
        this.endReservation = endReservation;
    }
}
