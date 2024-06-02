package com.example.demo.employee;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class EmployeeService {
    public List<Employee> getReaders() {
        return List.of(
                new Employee(
                        1L,
                        "Monika",
                        "Nová",
                        true,
                        "email@email.cz",
                        LocalDate.of(2001, 1, 1)
                )
        );
    }
}
