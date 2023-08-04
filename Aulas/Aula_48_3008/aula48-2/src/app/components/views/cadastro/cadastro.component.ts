import { Jogo } from 'src/app/models/jogo';
import { JogoService } from './../../../services/jogo.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit{
  //public jogo: Jogo = new Jogo();
  public jogo!: Jogo;

  constructor(private jogoService: JogoService) {}

  ngOnInit() {

  }

  saveJogo(){
    this.jogoService.postJogo(this.jogo).subscribe(resposta => {
      alert("O jogo " + this.jogo.nome + " foi cadastrado com sucesso!")
    });
  }
}
