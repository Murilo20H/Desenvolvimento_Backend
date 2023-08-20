package com.programando.lojajogosbackend.controller;

import com.programando.lojajogosbackend.model.Conta;
import com.programando.lojajogosbackend.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
@CrossOrigin("*")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> getContas(){
        return ResponseEntity.status(HttpStatus.OK).body(contaService.getContas());
    }

    @PostMapping
    public ResponseEntity<Conta> save(@RequestBody Conta contaRecebida){
        if (contaService.save(contaRecebida).equals(null)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(contaService.save(contaRecebida));
    }
}