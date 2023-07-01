package com.programando.aula401.controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class Controller {

    @GetMapping
    public String inicio() {
        return "Olá usuário, você está na rota inicial, rotas disponíveis: /produtos /produtos/(id do produto)";
    }
}