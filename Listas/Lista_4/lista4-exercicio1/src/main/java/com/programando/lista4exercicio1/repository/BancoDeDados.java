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
        cosmeticos.add(new Cosmetico(1, "Batom Vermelho", 399.99, "https://img.freepik.com/vetores-premium/respingo-de-batom-vermelho_118124-7105.jpg"));
        cosmeticos.add(new Cosmetico(2, "Batom Verde", 9.99, "https://d358a814b78lcf.cloudfront.net/Custom/Content/Products/10/03/1003030_batom-24-horas-5801_m2_637967718421952124.jpg"));
        cosmeticos.add(new Cosmetico(3, "Máscara Facial", 999.99, "https://tezmb9.vtexassets.com/arquivos/ids/157922/Mascara_Black.jpg?v=637551270759070000"));
        cosmeticos.add(new Cosmetico(4, "Sabonete Líquido", 299.99, "https://epocacosmeticos.vteximg.com.br/arquivos/ids/557355-500-500/sabonete-liquido-infantil-granado-bebe-camomila--3-.jpg?v=638228724965600000"));
        cosmeticos.add(new Cosmetico(5, "Shampoo e Condicionador", 149.99, "https://cdn.awsli.com.br/600x450/932/932521/produto/205110879/elseve-pure-hialuronico-shampoo-condicionador-200-ml-kit-bella-beauty-cosmeticos-kixxjz.jpg"));
        cosmeticos.add(new Cosmetico(6, "Hidratante a base de Ouro", 1499.99, "https://www.ramaterra.com.br/pub/media/catalog/product/cache/2757da04c78e9c5f260ce1396c9719a7/c/r/creme_sebo_de_carneiro.jpg"));
        cosmeticos.add(new Cosmetico(7, "Creme Facial", 249.99, "https://m.media-amazon.com/images/I/611E1ojIu2L.jpg"));
        cosmeticos.add(new Cosmetico(8, "Creme Corporal", 299.99, "https://images.tcdn.com.br/img/img_prod/740081/locao_hidratante_corporal_com_ceramidas_e_acido_hialuronico_473ml_cerave_2177_1_29d4ea67673accb0197fd8d56e320bdf.jpg"));
        cosmeticos.add(new Cosmetico(9, "Base", 199.99, "https://imageproxy.ifunny.co/crop:x-20,resize:640x,quality:90x75/images/3200f6f1e46a53308d58ac7e06bcf2ae068615c3d4484b8139251a198ee4af76_1.jpg"));
        cosmeticos.add(new Cosmetico(10, "Kit Antiacne", 199.99, "https://cdn.awsli.com.br/1659/1659102/produto/188319181/fff09d5988.jpg"));
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
