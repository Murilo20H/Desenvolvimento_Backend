package com.programando.aula521.controller;

import com.programando.aula521.model.Jogo;
import com.programando.aula521.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> getJogos(){
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.getJogos());
    }

    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo jogoRecebido){
        if (jogoService.save(jogoRecebido).equals(null)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(jogoService.save(jogoRecebido));
    }
}