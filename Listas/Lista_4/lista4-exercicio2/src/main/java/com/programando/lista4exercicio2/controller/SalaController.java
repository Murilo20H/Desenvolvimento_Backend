package com.programando.lista4exercicio2.controller;

import com.programando.lista4exercicio2.model.Sala;
import com.programando.lista4exercicio2.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }

    @PutMapping
    public String putSala(@RequestBody Sala sala){
        return salaService.putSala(sala);
    }
}
