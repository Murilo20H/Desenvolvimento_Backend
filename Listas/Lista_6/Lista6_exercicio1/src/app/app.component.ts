import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cosmetico } from './models/cosmetico';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Lista6_exercicio1';

  cosmeticos!: Cosmetico[];

  constructor(private httpClient: HttpClient){}

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.httpClient.get<Cosmetico[]>("http://localhost:8080/cosmeticos").subscribe(retorno => {
      this.cosmeticos = retorno;
    })
  }
}
