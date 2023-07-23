package com.programando.aula462.repository;

import com.programando.aula462.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados() {
        jogos.add(new Jogo(1, "Assassin's Creed Origins", "Assassin's Creed Origins é um jogo eletrônico de ação-aventura, produzido pela Ubisoft Montreal e publicado pela Ubisoft.", 179.99, "https://cdn1.epicgames.com/camellia/offer/ACH_UCS12001_EGST_BannerBundle_STD_US_Edition_Capsule_1920X1080-1920x1080-1fc629970a67d3ec95dbce7f08c0a790c0263482.jpg", "https://store.steampowered.com/app/582160/Assassins_Creed_Origins/"));
        jogos.add(new Jogo(2, "Slime Rancher", "Slime Rancher é um jogo eletrônico de aventura e simulação, produzido pela Monomi Park e publicado pela Monomi Park e Skybound Games.", 36.99, "https://cdn1.epicgames.com/corydalis/offer/SlimeRancher-Keyart_Wishlist-Landscape-2560x1440-b2f7b22e6d19dff415daf5dbe4d8e78c.jpg", "https://store.steampowered.com/app/433340/Slime_Rancher/"));
        jogos.add(new Jogo(3, "Grand Theft Auto V", "Grand Theft Auto V é um jogo eletrônico de ação-aventura desenvolvido pela Rockstar North e publicado pela Rockstar Games.", 109.89, "https://1.bp.blogspot.com/-vAt6zg4W8vU/UjhYkJ6yIWI/AAAAAAAABmQ/1jccTubGWbk/s1600/gta5-wallpaper.jpg", "https://store.steampowered.com/app/271590/Grand_Theft_Auto_V/"));
    }

    public List<Jogo> getJogos(){
        return jogos;
    }
}
