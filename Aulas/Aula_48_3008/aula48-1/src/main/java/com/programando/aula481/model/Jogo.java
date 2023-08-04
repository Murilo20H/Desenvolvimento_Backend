package com.programando.aula481.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jogo {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private String imagem;
    private String site;
    @JsonProperty("esta_favoritado")
    private boolean estaFavoritado;

    public Jogo() {}

    public Jogo(int id, String nome, String descricao, double preco, String imagem,String site, boolean estaFavoritado) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.site = site;
        this.estaFavoritado = estaFavoritado;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEstaFavoritado() {
        return estaFavoritado;
    }

    public void setEstaFavoritado(boolean estaFavoritado) {
        this.estaFavoritado = estaFavoritado;
    }
}
