package com.programando.lista1exercicio1.controller;

import com.programando.lista1exercicio1.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
        produtos.add(new Produto(123, "batata-doce", 1.25));
        produtos.add(new Produto(456, "ovo", 0.75));
        produtos.add(new Produto(789, "arroz integral", 11.25));
    }

    @GetMapping("")
    public String inicio(){
        return "Lista 1: exercício 1, rotas disponíveis: /produtos /produtos/(código de barras do produto)";
    }
    @GetMapping("/produtos")
    public List<Produto> getAll(){
        return produtos;
    }
    @GetMapping("/produtos/{codigoDeBarras}")
    public Produto getByCodigoDeBarras(@PathVariable int codigoDeBarras){
        for(Produto produto : produtos){
            if(produto.getCodigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }

    @PostMapping("/produtos")
    public String save(@RequestBody Produto produto){
        for (Produto item : produtos){
            if (item.getCodigoDeBarras() == produto.getCodigoDeBarras()){
                return "Produto já existente";
            }
        }
        this.produtos.add(produto);
        return "Produto " + produto.getNome() + " foi adicionado ao estoque!";
    }
}
