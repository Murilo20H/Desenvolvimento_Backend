package com.programando.aula421.repository;

import com.programando.aula421.model.Torneio;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Torneio> torneios = new ArrayList<>();

    public BancoDeDados(){
        torneios.add(new Torneio(1, "Title Tuesday", "Chess.com", new BigDecimal(1000)));
        torneios.add(new Torneio(2, "Tata Steal", "Holanda", new BigDecimal(2000)));
        torneios.add(new Torneio(3, "Copa do Mundo", "Africa do Sul", new BigDecimal(5500)));
    }

    public List<Torneio> findAll(){
        return torneios;
    }

    public String save(Torneio torneio){
        this.torneios.add(torneio);
        return "O torneio " + torneio.getNome() + " (id: " + torneio.getId() + ") foi adicionado com sucesso!";
    }

    public String delete(Torneio torneio){
        String nome = null;
        int id = 0;
        for (Torneio torneioDoBancoDeDados : torneios) {
            if (torneioDoBancoDeDados.equals(torneio)){
                nome = torneio.getNome();
                id = torneio.getId();
                torneios.remove(torneio);
                return "O torneio " + nome + " (id: " + id + ") foi removido com sucesso!";
            }
        }
        return "O torneio " + nome + " (id: " + id + ") não foi encontrado!";
    }

    public String deleteById(int id) {
        String nome = null;
        int indentificador = 0;
        for (Torneio torneio : torneios) {
            if (torneio.getId() == id) {
                nome = torneio.getNome();
                indentificador = torneio.getId();
                torneios.remove(torneio);
                return "O torneio " + nome + " (id: " + indentificador + ") foi removido com sucesso!";
            }
        }
        return "O torneio " + nome + " (id: " + indentificador + ") não foi encontrado!";
    }
}
