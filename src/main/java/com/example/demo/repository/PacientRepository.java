package com.example.demo.repository;

import com.example.demo.pacient.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PacientRepository extends JpaRepository<Pacient,Integer> {

    List<Pacient> findPacientByOdbornostId(Integer odbornostId);
}
