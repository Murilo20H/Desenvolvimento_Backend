package com.programando.provamurilo.repository;

import com.programando.provamurilo.model.Funcionario;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public BancoDeDados(){
        funcionarios.add(new Funcionario(1, "Jorge", 3150.50, "RH"));
        funcionarios.add(new Funcionario(2, "Jailson", 1999.99, "Administração"));
        funcionarios.add(new Funcionario(3, "Jadson", 4500.00, "Desenvolvedor Backend"));
        funcionarios.add(new Funcionario(4, "Joelinton", 7990.85, "Desenvolvedor Frontend"));
        funcionarios.add(new Funcionario(5, "Jaqueline", 2575.00, "Gestor de Negócios"));
        funcionarios.add(new Funcionario(6, "João", 3000.00, "Faxineiro"));
        funcionarios.add(new Funcionario(7, "Jorginho", 9500.40, "Chefe"));
        funcionarios.add(new Funcionario(8, "Jussara", 1999.99, "Administração"));
        funcionarios.add(new Funcionario(9, "Jaspian", 2840.50, "Gestor Financeiro"));
        funcionarios.add(new Funcionario(10, "Jodesvaldo", 4500.00, "Mecânico"));
    }

    public List<Funcionario> obterTodos(){
        return funcionarios;
    }

    public String adicionarFuncionario(Funcionario funcionario){
        for(Funcionario funcionarioDoBancoDeDados : funcionarios){
            if (funcionarioDoBancoDeDados.getNumeroDeCracha() == funcionario.getNumeroDeCracha()){
                return "Impossível cadastrar, funcionário já consta no banco!";
            }
        }
        funcionarios.add(funcionario);
        return "Funcionário " + funcionario.getNome() + " cadastrado com sucesso!";
    }

    public String removerFuncionario(int numeroDeCracha){
        for(Funcionario funcionarioDoBancoDeDados : funcionarios){
            if (funcionarioDoBancoDeDados.getNumeroDeCracha() == numeroDeCracha){
                funcionarios.remove(funcionarioDoBancoDeDados);
                return "Funcionário deletado com sucesso!";
            }
        }
        return "Funcionário inexistente!";
    }
}
