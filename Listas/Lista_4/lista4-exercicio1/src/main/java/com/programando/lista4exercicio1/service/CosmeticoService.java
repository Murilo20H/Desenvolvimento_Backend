package com.programando.lista4exercicio1.service;

import com.programando.lista4exercicio1.model.Cosmetico;
import com.programando.lista4exercicio1.repository.BancoDeDados;

import java.util.List;

public class CosmeticoService {

    private BancoDeDados bancoDeDados = new BancoDeDados();
    public List<Cosmetico> findAll(){
        return bancoDeDados.findAll();
    }

    public Cosmetico getById(int id){
        List<Cosmetico> cosmeticos = bancoDeDados.findAll();
        for (Cosmetico cosmetico : cosmeticos) {
            if (cosmetico.getId() == id){
                return cosmetico;
            }
        }
        return null;
    }

    public String save(Cosmetico cosmetico){
        return bancoDeDados.save(cosmetico);
    }

    public String deleteById(int id){
        return bancoDeDados.deleteById(id);
    }
}
