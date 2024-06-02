package com.example.demo.odbornost;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "odbornost")
public class Odbornost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String popisOdbornosti;

    public Odbornost(Integer id, String popisOdbornosti) {
        this.id = id;
        this.popisOdbornosti = popisOdbornosti;
    }

    public Odbornost() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPopisOdbornosti() {
        return popisOdbornosti;
    }

    public void setPopisOdbornosti(String popisOdbornosti) {
        this.popisOdbornosti = popisOdbornosti;
    }
}
