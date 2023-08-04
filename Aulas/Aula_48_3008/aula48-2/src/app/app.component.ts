import { Component, OnInit } from '@angular/core';
import { Jogo } from './models/jogo';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'aula48-2';

  jogos!: Jogo[];

  constructor(private httpClient: HttpClient){}

  ngOnInit(): void {
    this.getJogos();
  }

  getJogos(){
    this.httpClient.get<Jogo[]>("http://localhost:8080/jogos").subscribe(retorno => {
      this.jogos = retorno;
    })
  }
}
