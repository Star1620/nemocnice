package com.example.demo.sal;

import com.example.demo.repository.SalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sal")
public class SalController {
    private final SalRepository salRepository;

    @Autowired
    public SalController(SalRepository salRepository) {
        this.salRepository = salRepository;
    }

    @GetMapping
    public List<Sal> getSaly() {
        return salRepository.findAll();
    }

    @PostMapping
    public Sal createSal(@RequestBody Sal sal ) { return salRepository.save(sal);
    }

}
