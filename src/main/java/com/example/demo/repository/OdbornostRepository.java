package com.example.demo.repository;

import com.example.demo.odbornost.Odbornost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdbornostRepository extends JpaRepository<Odbornost,Integer> {
}