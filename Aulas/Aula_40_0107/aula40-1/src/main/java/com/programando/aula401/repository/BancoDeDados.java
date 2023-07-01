package com.programando.aula401.repository;

import com.programando.aula401.model.Produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Produto> produtos = new ArrayList<>();

    public BancoDeDados(){
        produtos.add(new Produto(1, "Processador Intel Core i3-10100F", new BigDecimal(449.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(2, "Processador Intel Core i5-10400F", new BigDecimal(619.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(3, "Processador Intel Core i7-4790", new BigDecimal(312.00).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(4, "Processador Intel Core i9-12900K", new BigDecimal(3099.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(5, "Processador Intel Core i9-10900K", new BigDecimal(2399.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(6, "Processador Intel Core i9-11900K", new BigDecimal(2479.99).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(7, "Processador Intel Pentium Gold 7505", new BigDecimal(924.43).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(8, "Processador Intel Core i9-13900K", new BigDecimal(2869.09).setScale(2, RoundingMode.DOWN)));
        produtos.add(new Produto(9, "Processador Intel Core i5-9400", new BigDecimal(871.74).setScale(2, RoundingMode.DOWN)));

    }

    public List<Produto> findAll(){
        return produtos;
    }
}
