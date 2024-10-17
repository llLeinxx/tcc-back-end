package com.fatour.tcc.web.controller;


import com.fatour.tcc.dto.ExcursionDTO;
import com.fatour.tcc.entity.Excursion;
import com.fatour.tcc.service.ExcursionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/excursions")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ExcursionController {

    private ExcursionService excursionService;

    public ExcursionController(ExcursionService excursionService) {
        this.excursionService = excursionService;
    }

    @PostMapping
    public ResponseEntity<Excursion> insert(@RequestBody ExcursionDTO excursionDTO) {
        Excursion excursion = excursionService.insert(excursionDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(excursion);
    }

    @GetMapping
    public ResponseEntity<List<Excursion>> findAll() {
        List<Excursion> excursions = excursionService.findAll();
        return ResponseEntity.ok(excursions);
    }
}
