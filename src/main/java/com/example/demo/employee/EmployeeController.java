package com.example.demo.employee;

import com.example.demo.repository.EmployeeRepository;
import jakarta.persistence.Index;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, EmployeeService employeeService) {
        this.employeeRepository = employeeRepository;
        this.employeeService = employeeService;
    }


    public EmployeeController(EmployeeService employeeservice, EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeService = employeeservice;
    }

    @GetMapping()
    @ResponseBody
    public List<Employee> getEmployees(@RequestParam Integer ico) {
        return employeeService.findEmployeeByOdbornostId(ico);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee ) { return employeeRepository.save(employee);
    }
}
