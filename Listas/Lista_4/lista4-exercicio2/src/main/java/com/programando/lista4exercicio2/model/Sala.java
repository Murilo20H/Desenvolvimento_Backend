package com.programando.lista4exercicio2.model;

public class Sala {
    private int id;
    private boolean estaAlugada;
    private String nomeLocatorio;

    public Sala(){}

    public Sala(int id, boolean estaAlugada, String nomeLocatorio) {
        this.id = id;
        this.estaAlugada = estaAlugada;
        this.nomeLocatorio = nomeLocatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstaAlugada() {
        return estaAlugada;
    }

    public void setEstaAlugada(boolean estaAlugada) {
        this.estaAlugada = estaAlugada;
    }

    public String getNomeLocatorio() {
        return nomeLocatorio;
    }

    public void setNomeLocatorio(String nomeLocatorio) {
        this.nomeLocatorio = nomeLocatorio;
    }
}
