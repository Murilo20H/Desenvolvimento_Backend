package com.programando.lojajogosbackend.service;

import com.programando.lojajogosbackend.model.Jogo;
import com.programando.lojajogosbackend.repository.JogoRepository;
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