package com.example.demo.rezervace;

import com.example.demo.odbornost.Odbornost;
import com.example.demo.repository.OdbornostRepository;
import com.example.demo.repository.RezervaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rezervace")
public class RezervaceController {

    private final RezervaceRepository rezervaceRepository;

    @Autowired
    public RezervaceController(RezervaceRepository rezervaceRepository) {
        this.rezervaceRepository = rezervaceRepository;
    }

    @GetMapping()
    @ResponseBody
    public List<Rezervace> getRezervace(@RequestParam Integer employeeId, Integer salId) {
        return rezervaceRepository.findRezervaceByEmployeeIdAndSalId(employeeId,salId);
    }

    @PostMapping
    public Rezervace createRezervace(@RequestBody Rezervace rezervace ) { return rezervaceRepository.save(rezervace);
    }
}
