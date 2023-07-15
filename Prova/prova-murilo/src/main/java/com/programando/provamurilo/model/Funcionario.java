package com.programando.provamurilo.model;

public class Funcionario {
    private int numeroDeCracha;
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(){}

    public Funcionario(int numeroDeCracha, String nome, double salario, String cargo) {
        this.numeroDeCracha = numeroDeCracha;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getNumeroDeCracha() {
        return numeroDeCracha;
    }

    public void setNumeroDeCracha(int numeroDeCracha) {
        this.numeroDeCracha = numeroDeCracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
