package com.example.demo.odbornost;

import com.example.demo.repository.OdbornostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/odbornost")
public class OdbornostController {

    private final OdbornostRepository odbornostRepository;

    @Autowired
    public OdbornostController(OdbornostRepository odbornostRepository) {
        this.odbornostRepository = odbornostRepository;
    }

    @GetMapping
    public List<Odbornost> getOdbornost() {
        return odbornostRepository.findAll();
    }

    @PostMapping
    public Odbornost createOdbornost(@RequestBody Odbornost odbornost ) { return odbornostRepository.save(odbornost);
    }
}
