package com.programando.lista4exercicio1.repository;

import com.programando.lista4exercicio1.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados(){
        cosmeticos.add(new Cosmetico(1, "Batom Vermelho", new BigDecimal(399.99)));
        cosmeticos.add(new Cosmetico(2, "Batom Verde", new BigDecimal(9.99)));
        cosmeticos.add(new Cosmetico(3, "Máscara Facial", new BigDecimal(999.99)));
        cosmeticos.add(new Cosmetico(4, "Sabonete Líquido", new BigDecimal(299.99)));
        cosmeticos.add(new Cosmetico(5, "Shampoo e Condicionador", new BigDecimal(149.99)));
        cosmeticos.add(new Cosmetico(6, "Hidratante a base de Ouro", new BigDecimal(1499.99)));
        cosmeticos.add(new Cosmetico(7, "Creme Facial", new BigDecimal(249.99)));
        cosmeticos.add(new Cosmetico(8, "Creme Corporal", new BigDecimal(299.99)));
        cosmeticos.add(new Cosmetico(9, "Base", new BigDecimal(199.99)));
        cosmeticos.add(new Cosmetico(10, "Kit Antiacne", new BigDecimal(199.99)));
    }

    public List<Cosmetico> findAll(){
        return cosmeticos;
    }

    public String save(Cosmetico cosmetico){
        for (Cosmetico cosmeticoDoBancoDeDados : cosmeticos){
            if (cosmeticoDoBancoDeDados.getId() == cosmetico.getId()){
                return "Id do cosmético já existente!";
            }
        }
        cosmeticos.add(cosmetico);
        return "O cosmético " + cosmetico.getNome() + " (id: " + cosmetico.getId() + ") foi adicionado com sucesso!";
    }

    public String deleteById(int id){
        String nome = null;
        int identificador = 0;
        for (Cosmetico cosmetico : cosmeticos){
            if (cosmetico.getId() == id){
                nome = cosmetico.getNome();
                identificador = cosmetico.getId();
                cosmeticos.remove(cosmetico);
                return "O cosmético " + nome + " (id: " + identificador + ") foi removido com sucesso!";
            }
        }
        return "O torneio " + nome + " (id: " + identificador + ") não foi encontrado!";
    }
}
