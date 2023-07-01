package com.programando.aula401.service;

import com.programando.aula401.model.Produto;
import com.programando.aula401.repository.BancoDeDados;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ProdutoService {

    private BancoDeDados bancoDeDados = new BancoDeDados();

    public List<Produto> findAll(){
        return bancoDeDados.findAll();
    }

    public Produto getById(int id){
        List<Produto> produtos = bancoDeDados.findAll();
        for (Produto produto : produtos) {
            if (produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    public String efetivarPedido(Produto produto) {
        String url = "http://localhost:8081/pedidos";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(url, produto, Produto.class);
        return "A compra do produto " + produto.getNome() + " foi efetivada!";
    }
}
