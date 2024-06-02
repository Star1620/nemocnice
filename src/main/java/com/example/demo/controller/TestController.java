package com.example.demo.controller;

import com.example.demo.employee.Employee;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
//import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")

public class TestController {
    @GetMapping()
    Employee health() {
       // return new ResponseEntity<>( "Ahoj kámo", HttpStatus.OK) ;
        return   new Employee(
                    "Monika",
                    "Nová",
                    true,
                    "email@email.cz",
                    LocalDate.of(2001, 1, 1),
                    2
            );

    }
}
