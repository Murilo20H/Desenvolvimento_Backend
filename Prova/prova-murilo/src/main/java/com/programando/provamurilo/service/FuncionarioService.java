package com.programando.provamurilo.service;

import com.programando.provamurilo.model.Funcionario;
import com.programando.provamurilo.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionarioService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Funcionario> obterTodos(){
        return bancoDeDados.obterTodos();
    }

    public Funcionario obterPorCracha(int numeroDeCracha){
        List<Funcionario> funcionarios = obterTodos();
        for(Funcionario funcionarioDoBancoDeDados : funcionarios){
            if (funcionarioDoBancoDeDados.getNumeroDeCracha() == numeroDeCracha){
                return funcionarioDoBancoDeDados;
            }
        }
        return null;
    }

    public Funcionario obterPorMaiorSalario(){
        double maiorSalario = 0;
        List<Funcionario> funcionarios = obterTodos();
        for(Funcionario funcionarioDoBancoDeDados : funcionarios){
            if (funcionarioDoBancoDeDados.getSalario() > maiorSalario){
                maiorSalario = funcionarioDoBancoDeDados.getSalario();
            }
        }
        for(Funcionario funcionarioDoBancoDeDados : funcionarios){
            if (funcionarioDoBancoDeDados.getSalario() == maiorSalario){
                return funcionarioDoBancoDeDados;
            }
        }
        return null;
    }

    public String adicionarFuncionario(Funcionario funcionario){
        return bancoDeDados.adicionarFuncionario(funcionario);
    }

    public String removerFuncionario(int numeroDeCracha){
        return bancoDeDados.removerFuncionario(numeroDeCracha);
    }
}
