package com.programando.lojajogosbackend.service;

import com.programando.lojajogosbackend.model.Jogo;
import com.programando.lojajogosbackend.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Jogo favoritar(int id){
        Optional<Jogo> optionalJogo = jogoRepository.findById(id);
        if (optionalJogo.isPresent()) {
            Jogo jogo = optionalJogo.get();
            jogo.setEstaFavoritado(!jogo.isEstaFavoritado());
            jogoRepository.save(jogo);
            return jogo;
        }
        return null;
    }
}