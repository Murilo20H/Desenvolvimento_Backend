package com.programando.aula462.service;

import com.programando.aula462.model.Jogo;
import com.programando.aula462.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Jogo> getJogos(){
        return bancoDeDados.getJogos();
    }
}
