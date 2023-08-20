package com.programando.lojajogosbackend.controller;

import com.programando.lojajogosbackend.model.Categoria;
import com.programando.lojajogosbackend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> getCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.getCategorias());
    }

    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoriaRecebida){
        if (categoriaService.save(categoriaRecebida).equals(null)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.save(categoriaRecebida));
    }
}