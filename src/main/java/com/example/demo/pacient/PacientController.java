package com.example.demo.pacient;

import com.example.demo.repository.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pacient")
public class PacientController {
    private final PacientRepository pacientRepository;

    @Autowired
    public PacientController(PacientRepository pacientRepository) {
        this.pacientRepository = pacientRepository;
    }

    @GetMapping()
    @ResponseBody
    public List<Pacient> getPacient(@RequestParam Integer ico) {
        return pacientRepository.findPacientByOdbornostId(ico);
    }

    @PostMapping
    public Pacient createPacient(@RequestBody Pacient pacient ) { return pacientRepository.save(pacient);
    }

}
