package com.programando.provamurilo.contoller;

import com.programando.provamurilo.model.Funcionario;
import com.programando.provamurilo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> obterTodos(){
        return funcionarioService.obterTodos();
    }

    @GetMapping("/{numeroDeCracha}")
    public Funcionario obterPorCracha(@PathVariable int numeroDeCracha){
        return funcionarioService.obterPorCracha(numeroDeCracha);
    }

    @GetMapping("/maior-salario")
    public Funcionario obterPorMaiorSalario(){
        return funcionarioService.obterPorMaiorSalario();
    }

    @PostMapping
    public String adicionarFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioService.adicionarFuncionario(funcionario);
    }

    @DeleteMapping("/{numeroDeCracha}")
    public String removerFuncionario(@PathVariable int numeroDeCracha){
        return funcionarioService.removerFuncionario(numeroDeCracha);
    }
}
