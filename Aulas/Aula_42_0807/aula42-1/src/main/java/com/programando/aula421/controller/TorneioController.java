package com.programando.aula421.controller;

import com.programando.aula421.model.Torneio;
import com.programando.aula421.service.TorneioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class TorneioController {

    @Autowired
    private TorneioService torneioService;

    @GetMapping
    public String inicio(){
        return "Olá usuário, você está na rota inicial. Rotas disponíveis: /torneios /torneio/(id do torneio)";
    }

    @GetMapping("/torneios")
    public List<Torneio> getAll(){
        return torneioService.getAll();
    }

    @GetMapping("/torneios/{id}")
    public Torneio getById(@PathVariable int id){
        return torneioService.getById(id);
    }

    @PostMapping("/save")
    public String save(@RequestBody Torneio torneio){
        return torneioService.save(torneio);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Torneio torneio){
        return torneioService.delete(torneio);
    }

    @DeleteMapping("/delete/id")
    public String deleteById(@RequestBody int id){
        return torneioService.deleteById(id);
    }
}
