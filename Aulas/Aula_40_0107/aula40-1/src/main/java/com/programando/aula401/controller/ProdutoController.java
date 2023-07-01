package com.programando.aula401.controller;

import com.programando.aula401.model.Produto;
import com.programando.aula401.repository.BancoDeDados;
import com.programando.aula401.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

    @GetMapping
    public List<Produto> getAll(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Produto getById(@PathVariable int id){
        return produtoService.getById(id);
    }

    @PostMapping
    public String realizarPedido(@RequestBody Produto produto){
        return produtoService.efetivarPedido(produto);
    }

}
