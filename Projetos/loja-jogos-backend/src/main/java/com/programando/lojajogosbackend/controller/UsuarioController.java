package com.programando.lojajogosbackend.controller;

import com.programando.lojajogosbackend.model.Usuario;
import com.programando.lojajogosbackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuario(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getUsuario());
    }

    @PostMapping
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuarioRecebido){
        if (usuarioService.save(usuarioRecebido).equals(null)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuarioRecebido));
    }
}
