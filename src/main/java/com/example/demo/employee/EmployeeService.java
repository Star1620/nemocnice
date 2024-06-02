package com.example.demo.employee;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> findEmployeeByOdbornostId(Integer odbornostId) {
        return employeeRepository.findEmployeeByOdbornostId(odbornostId);
    }

}
