package com.programando.aula421.service;

import com.programando.aula421.model.Torneio;
import com.programando.aula421.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TorneioService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Torneio> getAll(){
        return bancoDeDados.findAll();
    }

    public Torneio getById(int id){
        List<Torneio> torneios = bancoDeDados.findAll();
        for (Torneio torneio : torneios) {
            if (torneio.getId() == id){
                return torneio;
            }
        }
        System.out.println("O torneio de id: " + id + " não foi encontrado!");
        return null;
    }

    public String save(Torneio torneio){
        return this.bancoDeDados.save(torneio);
    }

    public String delete(Torneio torneio){
        return this.bancoDeDados.delete(torneio);
    }

    public String deleteById(int id){
        return this.bancoDeDados.deleteById(id);
    }

}
