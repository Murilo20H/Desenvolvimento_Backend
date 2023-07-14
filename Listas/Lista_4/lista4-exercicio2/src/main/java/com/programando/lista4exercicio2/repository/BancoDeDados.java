package com.programando.lista4exercicio2.repository;

import com.programando.lista4exercicio2.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    private List<Sala> salas = new ArrayList<>();

    public BancoDeDados(){
        salas.add(new Sala(1, true, "Locatorio1"));
        salas.add(new Sala(2, false, ""));
        salas.add(new Sala(3, false, ""));
        salas.add(new Sala(4, true, "Locatorio4"));
        salas.add(new Sala(5, false, ""));
        salas.add(new Sala(6, false, ""));
        salas.add(new Sala(7, true, "Locatorio7"));
        salas.add(new Sala(8, true, "Locatorio8"));
    }
    public List<Sala> getAll(){
        return salas;
    }

    public String putSala(Sala sala){
        for (Sala salaDoBancoDeDados : salas) {
            if (salaDoBancoDeDados.getId() == sala.getId()){
                if (salaDoBancoDeDados.isEstaAlugada()){
                    return "Está sala " + sala.getId() + " já está alugada!";
                } else {
                    salaDoBancoDeDados.setEstaAlugada(true);
                    salaDoBancoDeDados.setNomeLocatorio(sala.getNomeLocatorio());
                    return "A sala " + sala.getId() + " foi alugada por " + sala.getNomeLocatorio() + "!";
                }
            }
        }
        return "Erro, por favor tente novamente!";
    }
}
