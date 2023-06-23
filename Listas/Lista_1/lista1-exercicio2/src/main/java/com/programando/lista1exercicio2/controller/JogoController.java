package com.programando.lista1exercicio2.controller;

import com.programando.lista1exercicio2.model.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class JogoController {

    private List<Jogo> jogos = new ArrayList<>();

    public JogoController(){
        jogos.add(new Jogo(1, "Minecraft", 139.90));
        jogos.add(new Jogo(2, "Undertale", 39.90));
        jogos.add(new Jogo(3, "Cuphead", 36.99));
    }

    @GetMapping("")
    public String inicio(){
        return "Lista 1: exercício 2, rotas disponíveis: /jogos /jogos/(id) /jogos/menor-preco";
    }
    @GetMapping("/jogos")
    public List<Jogo> getAll(){
        return jogos;
    }
    @GetMapping("/jogos/{id}")
    public Jogo getById(@PathVariable int id){
        for(Jogo jogo : jogos){
            if(jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }

    @GetMapping("/jogos/menor-preco")
    public Jogo getByMenorPreco(){
        double menorPreco = jogos.get(0).getPreco();
        for (int contador = 1; contador < jogos.size(); contador++) {
            if (jogos.get(contador).getPreco() < menorPreco) {
                menorPreco = jogos.get(contador).getPreco();
            }
        }
        Jogo jogoMaisBarato = null;
        for (Jogo jogo : jogos){
            if(jogo.getPreco() == menorPreco){
                jogoMaisBarato = jogo;
            }
        }
        return jogoMaisBarato;
    }

    @PostMapping("/jogos")
    public String save(@RequestBody Jogo jogo){
        for (Jogo item : jogos){
            if (item.getId() == jogo.getId()){
                return "Jogo já existente";
            }
        }
        this.jogos.add(jogo);
        return "Jogo " + jogo.getNome() + " foi adicionado ao catálogo!";
    }
}