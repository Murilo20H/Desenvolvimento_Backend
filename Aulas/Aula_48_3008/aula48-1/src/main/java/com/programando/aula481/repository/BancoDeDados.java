package com.programando.aula481.repository;

import com.programando.aula481.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        jogos.add(new Jogo(1, "Assassin's Creed Origins", "Assassin's Creed Origins é um jogo eletrônico de ação-aventura, produzido pela Ubisoft Montreal e publicado pela Ubisoft.", 179.99, "https://cdn1.epicgames.com/camellia/offer/ACH_UCS12001_EGST_BannerBundle_STD_US_Edition_Capsule_1920X1080-1920x1080-1fc629970a67d3ec95dbce7f08c0a790c0263482.jpg", "https://store.steampowered.com/app/582160/Assassins_Creed_Origins/", false));
        jogos.add(new Jogo(2, "Slime Rancher", "Slime Rancher é um jogo eletrônico de aventura e simulação, produzido pela Monomi Park e publicado pela Monomi Park e Skybound Games.", 36.99, "https://cdn1.epicgames.com/corydalis/offer/SlimeRancher-Keyart_Wishlist-Landscape-2560x1440-b2f7b22e6d19dff415daf5dbe4d8e78c.jpg", "https://store.steampowered.com/app/433340/Slime_Rancher/", false));
        jogos.add(new Jogo(3, "Grand Theft Auto V", "Grand Theft Auto V é um jogo eletrônico de ação-aventura desenvolvido pela Rockstar North e publicado pela Rockstar Games.", 109.89, "https://1.bp.blogspot.com/-vAt6zg4W8vU/UjhYkJ6yIWI/AAAAAAAABmQ/1jccTubGWbk/s1600/gta5-wallpaper.jpg", "https://store.steampowered.com/app/271590/Grand_Theft_Auto_V/", false));
        //ideias de jogos:
        //jogos.add(new Jogo(4, "Planet Zoo", "Planet Zoo é um jogo de simulação de construção e gerenciamento desenvolvido e publicado pela Frontier Developments para Microsoft Windows.", 100.00, "https://www.planetzoogame.com/images/og_image.jpg", "https://store.steampowered.com/app/703080/Planet_Zoo/", false));
        //jogos.add(new Jogo(5, "Need For Speed Heat", "Need for Speed Heat é um jogo eletrônico de corrida desenvolvido pela Ghost Games e publicado pela Electronic Arts.", 279.99, "https://image.api.playstation.com/vulcan/ap/rnd/202210/3121/XemhVDBuAEVrQXUkJF57ZsdX.jpg", "https://store.steampowered.com/app/1222680/Need_for_Speed_Heat/?psafe_param=1&gclid=CjwKCAjww7KmBhAyEiwA5-PUSkvkfH703hALU9cQpFJeiA5FAe3flZSSdU_b5FeJejXg44PydvAW7BoCr70QAvD_BwE", false));
        //jogos.add(new Jogo(6, "Battlefield 3", "Battlefield 3 é um jogo eletrônico de tiro em primeira pessoa desenvolvido pela DICE e publicado pela Electronic Arts.", 199.99, "data:image/jpeg;base64,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", "https://store.steampowered.com/app/1238820/Battlefield_3/", false));
    }

    public List<Jogo> getJogos(){
        return jogos;
    }

    public Jogo save(Jogo jogo){
        for (Jogo jogoNaLista : jogos){
            if (jogo.getId() == jogoNaLista.getId()){
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;
    }
}