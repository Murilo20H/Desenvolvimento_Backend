package com.programando.lojajogosbackend.service;

import com.programando.lojajogosbackend.model.Conta;
import com.programando.lojajogosbackend.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> getContas() {
        return contaRepository.findAll();
    }

    public Conta save(Conta conta) {
        return contaRepository.save(conta);
    }
}