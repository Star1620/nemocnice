package com.example.demo.sal;

import jakarta.persistence.*;

@Entity
@Table(name = "sal")
public class Sal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nazev;

    private String odbornosti;

    public Sal(Integer id, String nazev, String odbornosti) {
        this.id = id;
        this.nazev = nazev;
        this.odbornosti = odbornosti;
    }

    public Sal() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getOdbornosti() {
        return odbornosti;
    }

    public void setOdbornosti(String odbornosti) {
        this.odbornosti = odbornosti;
    }
}
