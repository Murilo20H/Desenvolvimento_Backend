package com.programando.lojajogosbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nome;
    private String foto;
    @NotNull
    @JsonProperty("maior_de_idade")
    private boolean maiorDeIdade;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    @JsonIgnoreProperties("usuarios")
    private Conta conta;

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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isMaiorDeIdade() {
        return maiorDeIdade;
    }

    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}