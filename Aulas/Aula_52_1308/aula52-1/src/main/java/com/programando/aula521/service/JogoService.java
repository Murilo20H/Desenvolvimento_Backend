package com.programando.aula521.service;

import com.programando.aula521.model.Jogo;
import com.programando.aula521.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> getJogos(){
        return jogoRepository.findAll();
    }

    public Jogo save(Jogo jogo){
        return jogoRepository.save(jogo);
    }
}