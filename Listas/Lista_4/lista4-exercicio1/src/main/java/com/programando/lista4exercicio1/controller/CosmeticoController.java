package com.programando.lista4exercicio1.controller;

import com.programando.lista4exercicio1.model.Cosmetico;
import com.programando.lista4exercicio1.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("*")
public class CosmeticoController {

    @Autowired
    private CosmeticoService cosmeticoService;

    @GetMapping
    public List<Cosmetico> getAll(){
        return cosmeticoService.findAll();
    }

    @GetMapping("/{id}")
    public Cosmetico getById(@PathVariable int id){
        return cosmeticoService.getById(id);
    }

    @PostMapping
    public String save(@RequestBody Cosmetico cosmetico){
        return cosmeticoService.save(cosmetico);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return cosmeticoService.deleteById(id);
    }
}
