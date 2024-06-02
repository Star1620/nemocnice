package com.example.demo.repository;


import com.example.demo.rezervace.Rezervace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RezervaceRepository extends JpaRepository<Rezervace,Integer> {
    List<Rezervace> findRezervaceByEmployeeIdAndSalId(Integer employeeId ,Integer salId);
}
