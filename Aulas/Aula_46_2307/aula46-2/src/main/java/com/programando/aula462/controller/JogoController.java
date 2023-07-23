package com.programando.aula462.controller;

import com.programando.aula462.model.Jogo;
import com.programando.aula462.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("http://localhost:4200")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> getJogos(){
        List<Jogo> jogos = jogoService.getJogos();
        return ResponseEntity.status(HttpStatus.OK).body(jogos);
    }
}
